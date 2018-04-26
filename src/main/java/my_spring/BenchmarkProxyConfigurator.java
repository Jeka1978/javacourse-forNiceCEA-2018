package my_spring;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    private BenchmarkToggle benchmarkToggle = new BenchmarkToggle();

    @Override
    public Object wrapWithProxy(Object t, Class type) {
        boolean methodWantBenchmark = Arrays.stream(type.getMethods()).anyMatch(method -> method.isAnnotationPresent(Benchmark.class));
        if (type.isAnnotationPresent(Benchmark.class)||methodWantBenchmark) {
            if (type.getInterfaces().length == 0) {
                return Enhancer.create(type, (InvocationHandler) (o, method, args) -> ih(t, type, method, args));
            }
            return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), (proxy, method, args) -> ih(t, type, method, args));
        }
        return t;
    }

    private Object ih(Object t, Class type, Method method, Object[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
        if (benchmarkToggle.isEnabled() && (type.isAnnotationPresent(Benchmark.class) || classMethod.isAnnotationPresent(Benchmark.class))) {

            System.out.println("********* BENCHMARK  " + method.getName() + " ****** starts");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end - start);
            System.out.println("********* BENCHMARK " + method.getName() + " ****** end");
            return retVal;
        } else {
            return method.invoke(t, args);
        }
    }
}

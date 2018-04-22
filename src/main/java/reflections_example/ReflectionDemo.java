package reflections_example;

import com.nice.cea.Person;
import lombok.SneakyThrows;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
public class ReflectionDemo {

    @SneakyThrows
    public static void printApi(Object o) {
        Class<?> type = o.getClass();
        String className = type.getName();
        System.out.println("className = " + className);
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            if (method.isAnnotationPresent(Test.class)) {
                method.invoke(o);
            }
        }
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getName());
        }
    }


    public static void main(String[] args) {
        Person person = new Person();
        printApi(person);
    }





}


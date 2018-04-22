package my_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private Reflections scanner = new Reflections();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            Class<T> implClass = config.getImplClass(type);
            if (implClass == null) {
                Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new RuntimeException(type + " has 0 or more than one impl, please update your config");
                }
                implClass = (Class<T>) classes.iterator().next();

            }
            type = implClass;
        }
        T t = type.newInstance();

        //todo make test pass
        return t;
    }


}






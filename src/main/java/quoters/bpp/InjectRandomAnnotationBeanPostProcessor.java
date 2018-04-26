package quoters.bpp;

import my_spring.InjectRandomAnnotationObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomAnnotationBeanPostProcessor implements BeanPostProcessor {
    private InjectRandomAnnotationObjectConfigurator configurator = new InjectRandomAnnotationObjectConfigurator();
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        configurator.configure(bean);
        return bean;
    }
}

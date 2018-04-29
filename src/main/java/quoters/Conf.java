package quoters;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Evgeny Borisov
 */
@Configuration
@PropertySource("classpath:quotes.properties")
@ComponentScan
@EnableAspectJAutoProxy
public class Conf {
    /*@Bean  if you have spring <4.3
    public PropertySourcesPlaceholderConfigurer configurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }*/
}

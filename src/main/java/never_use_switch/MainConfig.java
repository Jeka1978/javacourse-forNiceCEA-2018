package never_use_switch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */

@Configuration
@ComponentScan
@EnableScheduling
public class MainConfig {
    public static void main(String[] args) throws InterruptedException {
        new AnnotationConfigApplicationContext(MainConfig.class);
    }
}

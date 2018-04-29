package qualifiers_lab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableScheduling
@ComponentScan
public class MainConf {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(MainConf.class);
    }
}

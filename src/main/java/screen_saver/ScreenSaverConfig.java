package screen_saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class ScreenSaverConfig {
    private Random random = new Random();

    @Autowired
    private ApplicationContext context;

    @Bean(initMethod = "init")
    public ColorFrame colorFrame(){
        ColorFrame colorFrame = new ColorFrame();
        colorFrame.setColor(color());
        return colorFrame;
    }


    @Scope(value = "twoSeconds", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color(){

        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }














    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScreenSaverConfig.class);
        while (true) {
            context.getBean(ColorFrame.class).moveToRandomLocation();
            Thread.sleep(70);
        }
    }
}

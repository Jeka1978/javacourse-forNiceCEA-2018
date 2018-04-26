package my_spring;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * @author Evgeny Borisov
 */
@Getter
@Setter
public class BenchmarkToggle implements BenchmarkToggleMBean {
    private boolean enabled;

    @SneakyThrows
    public BenchmarkToggle() {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        mBeanServer.registerMBean(this, new ObjectName("niceMBeans", "name", "benchmark"));
    }

    @Override
    public void stopIt(int code) {
        System.out.println("Bonne Appetit");
        System.exit(code);
    }
}











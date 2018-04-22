package my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {
    @InjectRandom(min = 3,max = 7)
    private int repeat;

    @InjectRandomName
    private String name;

    @PostConstruct
    public void init() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {
        System.out.println(name+" was made in Japan");
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVvvvvvvvvvvvvvvvv");
        }
    }
}

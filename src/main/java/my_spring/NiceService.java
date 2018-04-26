package my_spring;

/**
 * @author Evgeny Borisov
 */

public class NiceService {
    public void doWork() {
        System.out.println("Working...");
    }

    @Benchmark
    public void drinkBeer() {
        System.out.println("Leff is the best");
    }
}

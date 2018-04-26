package quoters;

import lombok.Setter;
import my_spring.InjectRandom;

/**
 * @author Evgeny Borisov
 */
public class ShakespearQuoter implements Quoter {
    @Setter
    private String message;

    @InjectRandom(min = 3, max = 6)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}

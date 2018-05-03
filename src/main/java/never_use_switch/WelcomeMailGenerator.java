package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("mail1")
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        //80 lines of code
        return "Welcome new client";
    }
}

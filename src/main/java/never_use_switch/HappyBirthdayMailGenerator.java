package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("mail2")
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        //180 lines of code
        return "happy birthday";
    }
}

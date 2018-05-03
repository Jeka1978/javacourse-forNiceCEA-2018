package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ILoveSpringMailGenerator implements MailGenerator {
    @Override
    public String generateBody() {
        return "I love spring";
    }

    @Override
    public int myCode() {
        return 3;
    }
}

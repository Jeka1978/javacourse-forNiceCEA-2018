package never_use_switch;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class MailDaoImpl implements MailDao {

    @Override
    public int mailCode() {
        return new Random().nextInt(2) + 1;
    }
}

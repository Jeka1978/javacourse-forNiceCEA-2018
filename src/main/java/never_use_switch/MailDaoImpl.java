package never_use_switch;

import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Repository
public class MailDaoImpl implements MailDao {

    @Override
    public int mailCode() {
        return new Random().nextInt(3) + 1;
    }
}

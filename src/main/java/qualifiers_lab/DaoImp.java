package qualifiers_lab;

import org.springframework.stereotype.Repository;

import static qualifiers_lab.DBType.MONGO;

/**
 * @author Evgeny Borisov
 */

@NiceRepo(MONGO)
public class DaoImp implements Dao {
    @Override
    public void save() {
        System.out.println("Saving to prod...");
    }
}

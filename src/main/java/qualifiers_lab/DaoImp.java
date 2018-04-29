package qualifiers_lab;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */

//prod code
@Repository
public class DaoImp implements Dao {
    @Override
    public void save() {
        System.out.println("Saving to prod...");
    }
}

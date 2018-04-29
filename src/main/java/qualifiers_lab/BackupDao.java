package qualifiers_lab;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */

//backup code
@Repository
public class BackupDao implements Dao {
    @Override
    public void save() {
        System.out.println("backuping...");
    }
}

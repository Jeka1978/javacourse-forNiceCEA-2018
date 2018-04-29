package qualifiers_lab;

import org.springframework.stereotype.Repository;

import static qualifiers_lab.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */

@NiceRepo(ORACLE)
public class BackupDao implements Dao {
    @Override
    public void save() {
        System.out.println("backuping...");
    }
}

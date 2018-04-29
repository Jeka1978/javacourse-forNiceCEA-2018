package qualifiers_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static qualifiers_lab.DBType.MONGO;
import static qualifiers_lab.DBType.ORACLE;

/**
 * @author Evgeny Borisov
 */
@Service
public class DBService {
    @NiceRepo(MONGO)
    private Dao prodDao;
    @NiceRepo(ORACLE)
    private Dao backupDao;

    @Scheduled(fixedDelay = 1000)
    public void doWork(){
        prodDao.save();
    }

    @Scheduled(fixedDelay = 3000)
    public void doBackup(){
        backupDao.save();
    }
}

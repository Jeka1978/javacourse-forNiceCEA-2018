package transaction_problem_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private DataService proxy;

    @Override
    @Transactional
    public void saveAll(Stream<Data> dataStream) {

        dataStream.forEach(proxy::save);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Data data) {
        System.out.println("saving "+data);
    }
}






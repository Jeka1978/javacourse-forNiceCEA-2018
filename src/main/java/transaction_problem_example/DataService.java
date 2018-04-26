package transaction_problem_example;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public interface DataService {
    void saveAll(Stream<Data> dataStream);

    void save(Data data);
}

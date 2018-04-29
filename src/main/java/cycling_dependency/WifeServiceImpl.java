package cycling_dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
@Lazy
public class WifeServiceImpl implements WifeService {
    private final HusbandService service;

    @Autowired
    public WifeServiceImpl(@Lazy HusbandService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        service.doWork();
    }

    @Override
    public void doWork(){
        System.out.println("I'm helping to my husband");
    }
}

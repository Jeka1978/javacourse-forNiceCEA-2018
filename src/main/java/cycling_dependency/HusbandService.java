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
public class HusbandService {
    private final WifeService wifeService;

    @Autowired
    public HusbandService(@Lazy WifeService wifeService) {
        this.wifeService = wifeService;
    }

    @PostConstruct
    public void init(){
        wifeService.doWork();
    }


    public void doWork(){
        System.out.println("I'm helping to my wife");
    }
}

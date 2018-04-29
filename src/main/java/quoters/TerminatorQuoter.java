package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */

@Film
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @Value("${terminator}")
    private void setMessages(String[] line) {
        messages = Arrays.asList(line);
    }


    @Override
    @Deprecated
    public void sayQuote() {
        messages.forEach(System.out::println);
    }


    @PreDestroy
    public void killAll() {
        System.out.println("You are terminated...");
    }













}

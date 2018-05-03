package never_use_switch;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Service
public class MailSender {
    private final MailDao dao;
    private final Map<String, MailGenerator> map;


    @Scheduled(fixedDelay = 1000)
    public void sendMail() {
        int mailCode = dao.mailCode();
        String generatorName= "mail"+String.valueOf(mailCode);

        MailGenerator mailGenerator = map.getOrDefault(generatorName, () -> {
            throw new UnsupportedOperationException(mailCode + " is not supported yet");
        });
        String body = mailGenerator.generateBody();
        send(body);
    }

    private void send(String body) {
        System.out.println("sending <html> "+body+" </html>");
    }
}

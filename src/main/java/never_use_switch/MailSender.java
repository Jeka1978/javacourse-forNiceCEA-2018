package never_use_switch;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailSender {
    private final MailDao dao;
    private final Map<Integer, MailGenerator> map = new HashMap<>();

    @Autowired
    public MailSender(MailDao dao, List<MailGenerator> mailGenerators) {
        this.dao = dao;
        for (MailGenerator mailGenerator : mailGenerators) {
            int code = mailGenerator.myCode();
            if (map.containsKey(code)) {
                throw new IllegalStateException(code + " already in use");
            }
            map.put(code, mailGenerator);
        }
    }

    @Scheduled(fixedDelay = 1000)
    public void sendMail() {
        int mailCode = dao.mailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + " is not supported yet");
        }
        String body = mailGenerator.generateBody();
        send(body);
    }

    private void send(String body) {
        System.out.println("sending <html> "+body+" </html>");
    }
}

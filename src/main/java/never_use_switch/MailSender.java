package never_use_switch;

/**
 * @author Evgeny Borisov
 */

public class MailSender {
    private MailDao dao = new MailDaoImpl();
    public void sendMail() {
        int mailCode = dao.mailCode();
        switch (mailCode) {
            case 1:
                //200 lines of code which will send mail of WELCOME
                System.out.println("wELCOME");
                break;
            case 2:
                //200 lines of code which will send mail of HAPPY_BIRHDAY
                System.out.println("happy birthday");
                break;
        }
    }
}

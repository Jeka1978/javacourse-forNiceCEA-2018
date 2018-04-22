package my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
       /* IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();*/
        NiceService niceService = ObjectFactory.getInstance().createObject(NiceService.class);
        niceService.doWork();
        niceService.drinkBeer();
    }
}

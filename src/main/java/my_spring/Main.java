package my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
       /* IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();*/
        NiceService niceService = ObjectFactory.getInstance().createObject(NiceService.class);
        System.out.println(niceService.getClass());
        while (true) {
            niceService.doWork();
            niceService.drinkBeer();
            Thread.sleep(1000);
        }
    }
}

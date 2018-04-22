package my_spring;

/**
 * @author Evgeny Borisov
 */
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    public void cleanRoom() {

        speaker.sayMessage("I started...");
        cleaner.clean();
        speaker.sayMessage("I finished...");
    }
}

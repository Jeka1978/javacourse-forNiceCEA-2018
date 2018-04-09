package polymorphism;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("au au");
    }

    public void bringStick() {
        System.out.println("this is your stick");
    }
}

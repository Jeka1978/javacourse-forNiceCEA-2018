package polymorphism;

/**
 * @author Evgeny Borisov
 */
public class AnimalDoctor {
    public void treat(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).bringStick();
        }
    }
}

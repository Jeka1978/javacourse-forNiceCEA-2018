package my_spring;

import lombok.Data;
import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Data
public class Elf {
    @InjectRandom(min = 10, max = 15)
    private int power;
    @InjectRandom(min = 20, max = 35)
    private int speed;

    public static void main(String[] args) {
        Elf elf = ObjectFactory.getInstance().createObject(Elf.class);

    }

}

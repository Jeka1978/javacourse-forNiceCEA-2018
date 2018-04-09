package enums;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class Human {
    private String name;
    private MartialStatus status;

    public Human(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Human jeka = new Human("jeka");
        Human yaniv = new Human("yaniv", MartialStatus.MARRIED);
        System.out.println(jeka.getStatus()==(yaniv.getStatus()));
        System.out.println(yaniv.getStatus().getDbCode());
        System.out.println(jeka.getStatus());
        MartialStatus status = MartialStatus.findByDbCode(2);
        System.out.println(status);
    }


}

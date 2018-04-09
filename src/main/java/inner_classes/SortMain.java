package inner_classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class SortMain {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "scala", "groovy", "c#");
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(strings);
    }
}

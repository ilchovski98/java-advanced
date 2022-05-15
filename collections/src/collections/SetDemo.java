package collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // Union operation - combines both sets unique values
//        set1.addAll(set2);
//        System.out.println(set1);

        // Intersection - returns the common values in both sets
//        set1.retainAll(set2);
//        System.out.println(set1);

        // Difference - returns the item that we have in set1 but not in set2
        set1.removeAll(set2);
        System.out.println(set1);
    }
}

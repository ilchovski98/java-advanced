package collections;

import java.util.*;

public class SetDemo {
    public static void show() {
//        Set<String> set = new HashSet<>();
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");
//        System.out.println(set);
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        System.out.println("collection" + collection);
        Set<String> set = new HashSet<>(collection);
        System.out.println("Set " + set);
    }
}

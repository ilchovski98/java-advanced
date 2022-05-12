package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        for (var item : collection) {
            System.out.println(item);
        }

        System.out.println(collection);

        var containsA = collection.contains("a");
        System.out.println("containsA " + containsA);
        System.out.println(collection.isEmpty());
        var objectArray = collection.toArray();
        var stringArray = collection.toArray(new String[0]);
    }
}

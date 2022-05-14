package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        list.add(0, "!");
        list.set(0, "a+");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.indexOf("a"));
        System.out.println(list.subList(0,2));
    }
}

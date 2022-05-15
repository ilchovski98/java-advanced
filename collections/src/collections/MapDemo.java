package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();

        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var unknown = new Customer("Unknown", "");
        var customer = map.get("e2");
        var customer2 = map.getOrDefault("e10", unknown);
        var exists = map.containsKey("e10");
        var replaceCustomer = map.replace("e1", new Customer("a++", "e1"));

        System.out.println("customer " + customer);
        System.out.println("customer2 " + customer2);
        System.out.println("exists " + exists);
        System.out.println("replaceCustomer " + replaceCustomer);
        System.out.println("map " + map);

        for (var key : map.keySet())
            System.out.println(key);

        for (var entry : map.entrySet())
            System.out.println(entry);
//            System.out.println(entry.getKey());

        for (var currentCustomer : map.values())
            System.out.println(currentCustomer);

    }
}

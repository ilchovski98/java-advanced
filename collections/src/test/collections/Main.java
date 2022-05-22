package test.collections;

import java.util.ArrayList;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.forEach((n) -> {
            System.out.println(n);
        });

        Hashtable<Integer, String> numero = new Hashtable<>();
        numero.put(11, "Bread");
        numero.put(20, "Grape");
        numero.put(5, "Banana");
        numero.put(100, "Cat");
        System.out.println(numero.entrySet());
    }
}

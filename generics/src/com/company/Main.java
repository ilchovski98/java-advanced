package com.company;

public class Main {
    public static void main(String[] args) {
//        var list = new List();
//        list.add(21);
//        list.add(Integer.valueOf(21));
//        list.add("New string");
//        list.add(new User());
//
//        int number = (int)list.get(1);
//        System.out.println(number);

        var list = new GenericList<String>();
        list.add("Yeah");
        String string = list.get(0);
        System.out.println(string);

//        var intList = new GenericList<Integer>();
        GenericList<Integer> intList = new GenericList<>();
        intList.add(1); // Boxing
        int ints = intList.get(0); // Unboxing
        System.out.println(ints);
    }
}

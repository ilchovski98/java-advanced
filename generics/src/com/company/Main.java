package com.company;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add(21);
        list.add(Integer.valueOf(21));
        list.add("New string");
        list.add(new User());

        int number = (int)list.get(1);
        System.out.println(number);
    }
}

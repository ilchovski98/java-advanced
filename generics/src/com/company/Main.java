package com.company;

import jdk.jshell.execution.Util;

public class Main {
    public static void main(String[] args) {
        var max = Utils.max(new User(10), new User(20));
        System.out.println(max);

        Utils.print(21, "Nikola");
    }
}

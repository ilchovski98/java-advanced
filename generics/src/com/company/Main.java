package com.company;

import jdk.jshell.execution.Util;

public class Main {
    public static void main(String[] args) {
        var instructors = new GenericList<Instructor>();
        Utils.printUsers(instructors);
    }
}

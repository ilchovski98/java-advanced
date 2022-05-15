package lambdas;

public class LambdasDemo {
    public static void print(String message) {
        System.out.println(message);
    }

    public void show() {
//        greet(message -> System.out.println(message));
//        greet(System.out::println);
//        greet(message -> print(message));
        greet(LambdasDemo::print);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World!");
    }
}

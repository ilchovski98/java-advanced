package lambdas;

public class LambdasDemo {
    public static void show() {
        greet(message -> System.out.println(message));

//        Printer printer = new ConsolePrinter();
//        Printer printer1 = message -> System.out.println(message);
//        printer.print("yeah1");
//        printer1.print("yeah2");
    }

    public static void greet(Printer printer) {
        printer.print("Hello World!");
    }
}

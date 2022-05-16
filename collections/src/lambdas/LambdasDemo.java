package lambdas;

public class LambdasDemo {
    public LambdasDemo(String message) {
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }

    public void show() {
//        greet(message -> new LambdasDemo(message));
        greet(LambdasDemo::new);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World!");
    }
}

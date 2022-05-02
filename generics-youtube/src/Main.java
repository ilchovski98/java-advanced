public class Main {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(12);
        Printer<Double> doublePrinter = new Printer<>(12.2);

        printer.print();
        doublePrinter.print();
    }
}

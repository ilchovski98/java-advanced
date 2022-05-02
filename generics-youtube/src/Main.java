public class Main {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(12);
        Printer<Double> doublePrinter = new Printer<>(12.2);

        printer.print();
        doublePrinter.print();
        shout("Nikola");
        multipleShout("Nikola", "Rumi");
    }

    private static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + "!!!!");
    }

    private static <T, V> void multipleShout(T thingToShout, V thingToShout2) {
        System.out.println(thingToShout + "!!!!");
        System.out.println(thingToShout2 + "!!!!");
    }
}

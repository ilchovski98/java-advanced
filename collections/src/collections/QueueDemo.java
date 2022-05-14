package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");

        var front = queue.peek();
//        var front = queue.element();
        System.out.println(front);
        System.out.println(queue);
        var frontAndRemove = queue.remove();
//        var frontAndRemove = queue.poll();
        System.out.println(frontAndRemove);
        System.out.println(queue);
    }
}

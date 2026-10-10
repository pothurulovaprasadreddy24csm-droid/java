import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceDemo {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("B");
        deque.addLast("C");

        System.out.println("Deque: " + deque);

        deque.offerFirst("A");
        deque.offerLast("D");

        System.out.println("After offers: " + deque);

        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

        System.out.println("Deque: " + deque);

        System.out.println("Polled first: " + deque.pollFirst());
        System.out.println("Polled last: " + deque.pollLast());

        System.out.println("Final Deque: " + deque);
    }
}
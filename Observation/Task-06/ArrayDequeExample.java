import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        // addFirst()
        numbers.addFirst(20);
        numbers.addFirst(10);
        System.out.println("After addFirst: " + numbers);

        // addLast()
        numbers.addLast(30);
        numbers.addLast(40);
        System.out.println("After addLast: " + numbers);

        // offerFirst()
        numbers.offerFirst(5);
        System.out.println("After offerFirst: " + numbers);

        // offerLast()
        numbers.offerLast(50);
        System.out.println("After offerLast: " + numbers);

        // peekFirst()
        System.out.println("First element: " + numbers.peekFirst());

        // peekLast()
        System.out.println("Last element: " + numbers.peekLast());

        // pollFirst()
        System.out.println("Removed first: " + numbers.pollFirst());
        System.out.println("After pollFirst: " + numbers);

        // pollLast()
        System.out.println("Removed last: " + numbers.pollLast());
        System.out.println("After pollLast: " + numbers);
    }
}
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> patients = new PriorityQueue<>();

        // add()
        patients.add(5);
        patients.add(2);
        patients.add(8);

        System.out.println("Priority Queue: " + patients);

        // offer()
        patients.offer(1);
        System.out.println("After offer: " + patients);

        // peek()
        System.out.println("Highest priority: " + patients.peek());

        // poll()
        System.out.println("Removed: " + patients.poll());
        System.out.println("After poll: " + patients);

        // remove()
        patients.remove(8);
        System.out.println("After removing 8: " + patients);

        // contains()
        System.out.println("Contains 5? " + patients.contains(5));

        // size()
        System.out.println("Queue size: " + patients.size());
    }
}
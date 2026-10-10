import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {

        Queue<String> tasks = new LinkedList<>();

        tasks.add("Study");
        tasks.add("Exercise");
        tasks.add("Practice");

        System.out.println("Tasks: " + tasks);

        tasks.offer("Revision");
        System.out.println("After offer: " + tasks);

        System.out.println("First task using element: " + tasks.element());
        System.out.println("First task using peek: " + tasks.peek());

        System.out.println("Removed task: " + tasks.remove());
        System.out.println("Queue after remove: " + tasks);

        System.out.println("Polled task: " + tasks.poll());
        System.out.println("Queue after poll: " + tasks);
    }
}
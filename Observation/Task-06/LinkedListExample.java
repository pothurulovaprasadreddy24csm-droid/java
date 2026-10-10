import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> stations = new LinkedList<>();

        // add()
        stations.add("Vizag");
        stations.add("Vijayawada");
        stations.add("Guntur");

        System.out.println("Stations: " + stations);

        // addFirst()
        stations.addFirst("Srikakulam");
        System.out.println("After addFirst: " + stations);

        // addLast()
        stations.addLast("Nellore");
        System.out.println("After addLast: " + stations);

        // get()
        System.out.println("Station at index 2: " + stations.get(2));

        // getFirst()
        System.out.println("First station: " + stations.getFirst());

        // getLast()
        System.out.println("Last station: " + stations.getLast());

        // remove(index)
        stations.remove(1);
        System.out.println("After removing index 1: " + stations);

        // remove(object)
        stations.remove("Guntur");
        System.out.println("After removing Guntur: " + stations);

        // removeFirst()
        System.out.println("Removed first: " + stations.removeFirst());

        // removeLast()
        System.out.println("Removed last: " + stations.removeLast());

        // offer()
        stations.offer("Tirupati");
        System.out.println("After offer: " + stations);

        // peek()
        System.out.println("First element using peek: " + stations.peek());

        // poll()
        System.out.println("Removed using poll: " + stations.poll());

        System.out.println("Final list: " + stations);
    }
}
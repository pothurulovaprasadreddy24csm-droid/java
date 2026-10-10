import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<Double> temperatures = new Vector<>();

        // add()
        temperatures.add(32.5);
        temperatures.add(35.2);
        temperatures.add(31.8);

        System.out.println("Temperatures: " + temperatures);

        // addElement()
        temperatures.addElement(36.4);
        System.out.println("After addElement: " + temperatures);

        // get()
        System.out.println("Temperature at index 1: "
                           + temperatures.get(1));

        // set()
        temperatures.set(0, 30.5);
        System.out.println("After set: " + temperatures);

        // remove(index)
        temperatures.remove(2);
        System.out.println("After removing index 2: " + temperatures);

        // removeElement()
        temperatures.removeElement(36.4);
        System.out.println("After removeElement: " + temperatures);

        // size()
        System.out.println("Size: " + temperatures.size());

        // capacity()
        System.out.println("Capacity: " + temperatures.capacity());

        // contains()
        System.out.println("Contains 30.5? "
                           + temperatures.contains(30.5));
    }
}
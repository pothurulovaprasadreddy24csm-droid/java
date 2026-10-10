import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceDemo {
    public static void main(String[] args) {

        Collection<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        Collection<String> moreFruits = new ArrayList<>();
        moreFruits.add("Orange");
        moreFruits.add("Grapes");

        fruits.addAll(moreFruits);

        System.out.println("Fruits: " + fruits);
        System.out.println("Contains Mango: " + fruits.contains("Mango"));
        System.out.println("Contains all: " + fruits.containsAll(moreFruits));
        System.out.println("Size: " + fruits.size());

        fruits.remove("Banana");
        System.out.println("After remove: " + fruits);

        fruits.removeAll(moreFruits);
        System.out.println("After removeAll: " + fruits);

        System.out.println("Is empty: " + fruits.isEmpty());

        Iterator<String> it = fruits.iterator();

        System.out.print("Elements: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        fruits.clear();
        System.out.println("\nAfter clear: " + fruits);
    }
}
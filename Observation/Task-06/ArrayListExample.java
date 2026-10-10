import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // add()
        numbers.add(25);
        numbers.add(10);
        numbers.add(40);
        numbers.add(15);

        System.out.println("Numbers: " + numbers);

        // add(index, element)
        numbers.add(2, 30);
        System.out.println("After inserting 30: " + numbers);

        // get()
        System.out.println("Element at index 1: " + numbers.get(1));

        // set()
        numbers.set(0, 50);
        System.out.println("After replacing first element: " + numbers);

        // remove(index)
        numbers.remove(3);
        System.out.println("After removing index 3: " + numbers);

        // remove(object)
        numbers.remove(Integer.valueOf(10));
        System.out.println("After removing 10: " + numbers);

        // contains()
        System.out.println("Contains 40? " + numbers.contains(40));

        // size()
        System.out.println("Size: " + numbers.size());

        // isEmpty()
        System.out.println("Is empty? " + numbers.isEmpty());

        // indexOf()
        numbers.add(40);
        System.out.println("First index of 40: " + numbers.indexOf(40));

        // lastIndexOf()
        System.out.println("Last index of 40: " + numbers.lastIndexOf(40));

        // sort()
        numbers.sort(null);
        System.out.println("Sorted list: " + numbers);

        // clear()
        numbers.clear();
        System.out.println("After clear: " + numbers);
    }
}
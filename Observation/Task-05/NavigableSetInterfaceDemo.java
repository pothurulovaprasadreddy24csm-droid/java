import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterfaceDemo {
    public static void main(String[] args) {

        NavigableSet<Integer> marks = new TreeSet<>();

        marks.add(25);
        marks.add(40);
        marks.add(55);
        marks.add(70);
        marks.add(85);

        System.out.println("Marks: " + marks);

        System.out.println("Lower than 55: " + marks.lower(55));
        System.out.println("Floor of 55: " + marks.floor(55));
        System.out.println("Ceiling of 60: " + marks.ceiling(60));
        System.out.println("Higher than 55: " + marks.higher(55));

        System.out.println("First removed: " + marks.pollFirst());
        System.out.println("After pollFirst: " + marks);

        System.out.println("Last removed: " + marks.pollLast());
        System.out.println("After pollLast: " + marks);

        System.out.println("Descending Set: " + marks.descendingSet());
    }
}
import java.util.TreeSet;
import java.util.SortedSet;

public class SortedSetInterfaceDemo {
    public static void main(String[] args) {

        SortedSet<String> names = new TreeSet<>();

        names.add("Vijay");
        names.add("Arun");
        names.add("Kiran");
        names.add("Sita");
        names.add("Rahul");

        System.out.println("Sorted Names: " + names);

        System.out.println("First Name: " + names.first());
        System.out.println("Last Name: " + names.last());

        System.out.println("Head Set: " + names.headSet("Kiran"));
        System.out.println("Tail Set: " + names.tailSet("Kiran"));
        System.out.println("Sub Set: " + names.subSet("Arun", "Sita"));

        System.out.println("Comparator: " + names.comparator());
    }
}
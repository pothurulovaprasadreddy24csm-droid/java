import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ListInterfaceDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Kiran");
        names.add("Arun");
        names.add("Kiran");

        System.out.println("Names: " + names);

        names.add(2, "Sita");
        System.out.println("After inserting Sita: " + names);

        System.out.println("Element at index 1: " + names.get(1));

        names.set(1, "Rahul");
        System.out.println("After replacing: " + names);

        names.remove(2);
        System.out.println("After removing index 2: " + names);

        System.out.println("First Kiran index: " + names.indexOf("Kiran"));
        System.out.println("Last Kiran index: " + names.lastIndexOf("Kiran"));

        System.out.println("SubList: " + names.subList(1, 3));

        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted names: " + names);
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterfaceDemo {
    public static void main(String[] args) {

        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("C++");

        ListIterator<String> it = languages.listIterator();

        System.out.println("Forward Traversal:");

        while (it.hasNext()) {
            System.out.println(
                "Index: " + it.nextIndex() +
                ", Value: " + it.next()
            );
        }

        System.out.println("Backward Traversal:");

        while (it.hasPrevious()) {
            System.out.println(
                "Index: " + it.previousIndex() +
                ", Value: " + it.previous()
            );
        }

        it = languages.listIterator();
        it.next();
        it.set("Java Programming");

        System.out.println("After set: " + languages);

        it.add("HTML");

        System.out.println("After add: " + languages);

        it.previous();
        it.remove();

        System.out.println("After remove: " + languages);
    }
}
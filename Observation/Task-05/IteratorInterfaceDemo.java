import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterfaceDemo {
    public static void main(String[] args) {

        List<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("DSA");
        subjects.add("OS");
        subjects.add("CN");

        Iterator<String> it = subjects.iterator();

        System.out.println("Subjects:");

        while (it.hasNext()) {
            String subject = it.next();

            System.out.println(subject);

            if (subject.equals("OS")) {
                it.remove();
            }
        }

        System.out.println("After removing OS: " + subjects);

        it = subjects.iterator();

        System.out.println("Remaining subjects:");

        it.forEachRemaining(subject -> System.out.println(subject));
    }
}
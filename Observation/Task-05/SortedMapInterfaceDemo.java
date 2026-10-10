import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterfaceDemo {
    public static void main(String[] args) {

        SortedMap<String, Integer> students = new TreeMap<>();

        students.put("Kiran", 85);
        students.put("Arun", 75);
        students.put("Rahul", 90);
        students.put("Sita", 80);
        students.put("Vijay", 95);

        System.out.println("Sorted Map: " + students);

        System.out.println("First Key: " + students.firstKey());
        System.out.println("Last Key: " + students.lastKey());

        System.out.println("Head Map: " + students.headMap("Sita"));
        System.out.println("Tail Map: " + students.tailMap("Sita"));
        System.out.println("Sub Map: " + students.subMap("Arun", "Vijay"));

        System.out.println("Comparator: " + students.comparator());
    }
}
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapInterfaceDemo {
    public static void main(String[] args) {

        NavigableMap<Integer, String> employees = new TreeMap<>();

        employees.put(101, "Arun");
        employees.put(105, "Rahul");
        employees.put(110, "Sita");
        employees.put(115, "Vijay");
        employees.put(120, "Kiran");

        System.out.println("Employees: " + employees);

        System.out.println("Lower key than 110: " + employees.lowerKey(110));
        System.out.println("Floor key of 110: " + employees.floorKey(110));
        System.out.println("Ceiling key of 112: " + employees.ceilingKey(112));
        System.out.println("Higher key than 110: " + employees.higherKey(110));

        System.out.println("First Entry: " + employees.firstEntry());
        System.out.println("Last Entry: " + employees.lastEntry());

        System.out.println("Removed First Entry: " + employees.pollFirstEntry());
        System.out.println("Map: " + employees);

        System.out.println("Removed Last Entry: " + employees.pollLastEntry());
        System.out.println("Map: " + employees);

        System.out.println("Descending Map: " + employees.descendingMap());
    }
}
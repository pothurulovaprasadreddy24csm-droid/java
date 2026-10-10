import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {
    public static void main(String[] args) {

        Set<String> cities = new HashSet<>();

        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Delhi");
        cities.add("Hyderabad");

        System.out.println("Cities: " + cities);

        cities.remove("Chennai");
        System.out.println("After removing Chennai: " + cities);

        System.out.println("Contains Delhi: " + cities.contains("Delhi"));
        System.out.println("Number of cities: " + cities.size());
        System.out.println("Is empty: " + cities.isEmpty());

        cities.clear();

        System.out.println("After clear: " + cities);
        System.out.println("Is empty: " + cities.isEmpty());
    }
}
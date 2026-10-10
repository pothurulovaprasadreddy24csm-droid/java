import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableExample {
    public static void main(String[] args) {

        Hashtable<String, String> capitals = new Hashtable<>();

        // put()
        capitals.put("India", "New Delhi");
        capitals.put("Japan", "Tokyo");
        capitals.put("France", "Paris");
        capitals.put("Brazil", "Brasilia");

        System.out.println("Capital Map: " + capitals);

        // get()
        System.out.println("Capital of Japan: "
                           + capitals.get("Japan"));

        // containsKey()
        System.out.println("India present? "
                           + capitals.containsKey("India"));

        // containsValue()
        System.out.println("Paris present? "
                           + capitals.containsValue("Paris"));

        // remove()
        capitals.remove("Brazil");
        System.out.println("After removing Brazil: " + capitals);

        // keys()
        System.out.println("Countries:");
        Enumeration<String> countryNames = capitals.keys();

        while (countryNames.hasMoreElements()) {
            System.out.println(countryNames.nextElement());
        }

        // elements()
        System.out.println("Capitals:");
        Enumeration<String> capitalNames = capitals.elements();

        while (capitalNames.hasMoreElements()) {
            System.out.println(capitalNames.nextElement());
        }

        // size()
        System.out.println("Number of countries: " + capitals.size());

        // isEmpty()
        System.out.println("Is Hashtable empty? " + capitals.isEmpty());
    }
}
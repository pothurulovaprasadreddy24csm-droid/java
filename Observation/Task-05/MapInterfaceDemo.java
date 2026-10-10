import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo {
    public static void main(String[] args) {

        Map<String, Integer> products = new HashMap<>();

        products.put("Pen", 20);
        products.put("Book", 50);
        products.put("Bag", 100);

        System.out.println("Products: " + products);

        System.out.println("Price of Book: " + products.get("Book"));

        products.remove("Pen");
        System.out.println("After removing Pen: " + products);

        System.out.println("Contains Bag: " + products.containsKey("Bag"));
        System.out.println("Contains value 50: " + products.containsValue(50));

        System.out.println("Keys: " + products.keySet());
        System.out.println("Values: " + products.values());
        System.out.println("Entries: " + products.entrySet());

        System.out.println("Size: " + products.size());
        System.out.println("Is empty: " + products.isEmpty());

        products.clear();

        System.out.println("After clear: " + products);
    }
}
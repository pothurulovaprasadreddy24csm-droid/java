import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> inventory = new HashMap<>();

        // put()
        inventory.put("Keyboard", 15);
        inventory.put("Mouse", 25);
        inventory.put("Monitor", 8);
        inventory.put("Printer", 4);

        System.out.println("Inventory: " + inventory);

        // get()
        System.out.println("Mouse quantity: " + inventory.get("Mouse"));

        // remove()
        inventory.remove("Printer");
        System.out.println("After removing Printer: " + inventory);

        // containsKey()
        System.out.println("Has Monitor? "
                           + inventory.containsKey("Monitor"));

        // containsValue()
        System.out.println("Has quantity 25? "
                           + inventory.containsValue(25));

        // keySet()
        System.out.println("Products: " + inventory.keySet());

        // values()
        System.out.println("Quantities: " + inventory.values());

        // entrySet()
        System.out.println("Entries: " + inventory.entrySet());

        // size()
        System.out.println("Number of products: " + inventory.size());

        // isEmpty()
        System.out.println("Is inventory empty? " + inventory.isEmpty());

        // getOrDefault()
        System.out.println("Speaker quantity: "
                           + inventory.getOrDefault("Speaker", 0));

        // clear()
        inventory.clear();
        System.out.println("After clear: " + inventory);
    }
}
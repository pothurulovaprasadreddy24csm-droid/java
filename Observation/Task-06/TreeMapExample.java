import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> ranks = new TreeMap<>();

        // put()
        ranks.put(4, "David");
        ranks.put(1, "Aman");
        ranks.put(3, "Ravi");
        ranks.put(2, "Kiran");
        ranks.put(6, "Neha");

        System.out.println("Rank list: " + ranks);

        // get()
        System.out.println("Name at rank 3: " + ranks.get(3));

        // remove()
        ranks.remove(6);
        System.out.println("After removing rank 6: " + ranks);

        // containsKey()
        System.out.println("Contains rank 2? "
                           + ranks.containsKey(2));

        // containsValue()
        System.out.println("Contains Ravi? "
                           + ranks.containsValue("Ravi"));

        // firstKey() and lastKey()
        System.out.println("First key: " + ranks.firstKey());
        System.out.println("Last key: " + ranks.lastKey());

        // higherKey() and lowerKey()
        System.out.println("Key higher than 2: "
                           + ranks.higherKey(2));

        System.out.println("Key lower than 3: "
                           + ranks.lowerKey(3));

        // ceilingKey() and floorKey()
        System.out.println("Ceiling key of 2: "
                           + ranks.ceilingKey(2));

        System.out.println("Floor key of 5: "
                           + ranks.floorKey(5));

        // entrySet()
        System.out.println("Entries: " + ranks.entrySet());
    }
}
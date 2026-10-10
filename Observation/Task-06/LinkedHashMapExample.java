import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> players = new LinkedHashMap<>();

        // put()
        players.put(7, "Dhoni");
        players.put(18, "Virat");
        players.put(45, "Rohit");
        players.put(33, "Hardik");

        System.out.println("Players: " + players);

        // get()
        System.out.println("Player with number 18: "
                           + players.get(18));

        // remove()
        players.remove(33);
        System.out.println("After removing number 33: " + players);

        // containsKey()
        System.out.println("Number 45 exists? "
                           + players.containsKey(45));

        // keySet()
        System.out.println("Jersey numbers: " + players.keySet());

        // values()
        System.out.println("Player names: " + players.values());

        // entrySet()
        System.out.println("Player entries: " + players.entrySet());
    }
}
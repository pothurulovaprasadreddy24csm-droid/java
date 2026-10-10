import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        // add()
        scores.add(45);
        scores.add(78);
        scores.add(32);
        scores.add(91);
        scores.add(65);
        scores.add(78);

        System.out.println("Scores: " + scores);

        // remove()
        scores.remove(32);
        System.out.println("After removing 32: " + scores);

        // contains()
        System.out.println("Contains 65? " + scores.contains(65));

        // first() and last()
        System.out.println("Lowest score: " + scores.first());
        System.out.println("Highest score: " + scores.last());

        // higher() and lower()
        System.out.println("Score higher than 65: " + scores.higher(65));
        System.out.println("Score lower than 65: " + scores.lower(65));

        // ceiling() and floor()
        System.out.println("Ceiling of 70: " + scores.ceiling(70));
        System.out.println("Floor of 70: " + scores.floor(70));

        // pollFirst()
        System.out.println("Removed lowest: " + scores.pollFirst());
        System.out.println("After pollFirst: " + scores);

        // pollLast()
        System.out.println("Removed highest: " + scores.pollLast());
        System.out.println("After pollLast: " + scores);
    }
}
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> plates = new Stack<>();

        // push()
        plates.push(10);
        plates.push(20);
        plates.push(30);
        plates.push(40);

        System.out.println("Stack: " + plates);

        // peek()
        System.out.println("Top plate: " + plates.peek());

        // pop()
        System.out.println("Removed plate: " + plates.pop());
        System.out.println("Stack after pop: " + plates);

        // empty()
        System.out.println("Is stack empty? " + plates.empty());

        // search()
        System.out.println("Position of 20: " + plates.search(20));
        System.out.println("Position of 10: " + plates.search(10));
    }
}
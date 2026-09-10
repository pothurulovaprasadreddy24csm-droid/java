import java.util.*;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {

        try {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(10);
            list.add(20);

            System.out.println(list.get(5));
        }
        catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Invalid index.");
            System.out.println("IndexOutOfBoundsException is handled successfully.");
        }
    }
}
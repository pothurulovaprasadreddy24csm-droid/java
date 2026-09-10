import java.util.*;

public class IllegalStateException {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            sc.close();

            sc.nextInt();
        }
        catch (IllegalStateException ise) {
            System.out.println("Scanner is already closed.");
            System.out.println("IllegalStateException is handled successfully.");
        }
    }
}
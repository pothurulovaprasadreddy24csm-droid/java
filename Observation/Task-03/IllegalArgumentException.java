public class IllegalArgumentException {
    public static void main(String[] args) {

        try {
            Integer.parseInt("abc");
        }
        catch (IllegalArgumentException iae) {
            System.out.println("Invalid argument.");
            System.out.println("IllegalArgumentException is handled successfully.");
        }
    }
}
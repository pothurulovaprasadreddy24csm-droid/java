public class NumberFormatException {
    public static void main(String[] args) {

        try {
            String name = "Java";

            int x = Integer.parseInt(name);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Cannot convert an invalid String into a number.");
            System.out.println("NumberFormatException is handled successfully.");
        }
    }
}
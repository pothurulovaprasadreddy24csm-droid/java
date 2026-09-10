public class ClassCastException {
    public static void main(String[] args) {

        try {
            Object obj = "Hello";

            Integer num = (Integer) obj;
        }
        catch (ClassCastException cce) {
            System.out.println("Cannot convert String to Integer.");
            System.out.println("ClassCastException is handled successfully.");
        }
    }
}
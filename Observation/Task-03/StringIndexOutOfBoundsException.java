public class StringIndexOutOfBoundsException {
    public static void main(String[] args) {

        try {
            String name = "Java";

            int x = name.charAt(6);
        }
        catch (StringIndexOutOfBoundsException siobe) {
            System.out.println("Cannot access an invalid position in a String.");
            System.out.println("StringIndexOutOfBoundsException is handled successfully.");
        }
    }
}
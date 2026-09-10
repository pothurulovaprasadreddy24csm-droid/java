public class NullPointerException {
    public static void main(String[] args) {

        try {
            String name = null;
            int x = name.length();
        }
        catch (NullPointerException npe) {
            System.out.println("Cannot find the length of a null String.");
            System.out.println("NullPointerException is handled successfully.");
        }
    }
}
public class NegativeArraySizeException {
    public static void main(String[] args) {

        try {
            int ar[] = new int[-5];
        }
        catch (NegativeArraySizeException nase) {
            System.out.println("Array size cannot be negative.");
            System.out.println("NegativeArraySizeException is handled successfully.");
        }
    }
}
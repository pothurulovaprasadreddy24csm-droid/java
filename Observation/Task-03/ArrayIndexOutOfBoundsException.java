public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        try {
            int ar[] = {10, 20, 30};

            System.out.println(ar[3]);
        }
        catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Cannot access an array using an invalid index.");
            System.out.println("ArrayIndexOutOfBoundsException is handled successfully.");
        }
    }
}
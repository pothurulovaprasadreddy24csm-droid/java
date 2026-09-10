public class ArrayStoreException {
    public static void main(String[] args) {

        try {
            Object arr[] = new String[3];

            arr[0] = 100;
        }
        catch (ArrayStoreException ase) {
            System.out.println("Invalid type of value stored in the array.");
            System.out.println("ArrayStoreException is handled successfully.");
        }
    }
}
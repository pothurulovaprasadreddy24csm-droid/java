import java.util.Scanner;

class LengthNotSufficientException extends Exception {

    LengthNotSufficientException(String message) {
        super(message);
    }
}

public class MobileValidation {

    static void checkNumber(String number)
            throws LengthNotSufficientException {

        try {

            // Check characters
            for (int i = 0; i < number.length(); i++) {

                if (!Character.isDigit(number.charAt(i))) {
                    throw new NumberFormatException();
                }
            }

            // More than 10 digits
            if (number.length() > 10) {

                int[] digits = new int[10];

                for (int i = 0; i < number.length(); i++) {
                    digits[i] = number.charAt(i) - '0';
                }
            }

            // Less than 10 digits
            if (number.length() < 10) {
                throw new LengthNotSufficientException(
                    "Invalid Mobile Number – LengthNotSufficientException"
                );
            }

            System.out.println("Valid number");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "Invalid Mobile Number-ArrayIndexOutOfBounds Exception");

        } catch (NumberFormatException e) {

            System.out.println(
                "Invalid Mobile Number –NumberFormatException");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String number = sc.nextLine();

        try {
            checkNumber(number);
        }
        catch (LengthNotSufficientException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Checking completed.");
            sc.close();
        }
    }
}
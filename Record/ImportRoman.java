import number.Roman;
import java.util.Scanner;

public class ImportRoman {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman Number: ");
        String roman = sc.nextLine();

        Roman r = new Roman();

        int result = r.romanToInteger(roman);

        System.out.println("Integer Value: " + result);

        sc.close();
    }
}
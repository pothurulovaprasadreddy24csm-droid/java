import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int maxLength = 0;
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            String current = "";

            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);

                // Check whether character is already present
                if (current.indexOf(ch) != -1) {
                    break;
                }

                current += ch;
            }

            if (current.length() > maxLength) {
                maxLength = current.length();
                longest = current;
            }
        }

        System.out.println("Length of longest substring: " + maxLength);
        System.out.println("Longest substring: " + longest);

        sc.close();
    }
}
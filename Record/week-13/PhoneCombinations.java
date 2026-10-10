import java.util.*;

public class PhoneCombinations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        String digits = sc.nextLine();

        String[] letters = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> combinations = new LinkedList<>();

        combinations.add("");

        for (char digit : digits.toCharArray()) {

            int number = digit - '0';

            List<String> newList = new LinkedList<>();

            for (String old : combinations) {

                for (char ch : letters[number].toCharArray()) {
                    newList.add(old + ch);
                }
            }

            combinations = newList;
        }

        System.out.println("Possible combinations:");

        System.out.println(combinations);

        sc.close();
    }
}

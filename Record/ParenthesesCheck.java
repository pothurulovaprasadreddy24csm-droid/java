import java.util.*;

public class ParenthesesCheck {

    public static boolean valid(String str) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);
            }

            else {

                if (stack.isEmpty())
                    return false;

                char open = stack.pop();

                if (ch == ')' && open != '(')
                    return false;

                if (ch == '}' && open != '{')
                    return false;

                if (ch == ']' && open != '[')
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets: ");
        String input = sc.nextLine();

        if (valid(input))
            System.out.println("Valid");
        else
            System.out.println("Not valid");

        sc.close();
    }
}
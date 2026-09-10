package assignments;

import java.util.Scanner;

public class StringOperations {
  public static void main(String[] args) {

    String str1 = "Hello Java";
    String str2 = "Programming";

    Scanner sc = new Scanner(System.in);

    System.out.println("1.length");
    System.out.println("2.charAt");
    System.out.println("3.equals");
    System.out.println("4.equalsIgnoreCase");
    System.out.println("5.substring");
    System.out.println("6.contains");
    System.out.println("7.replace");
    System.out.println("8.toUpperCase");
    System.out.println("9.toLowerCase");
    System.out.println("10.concat");
    System.out.println("11.indexOf");
    System.out.println("12.lastIndexOf");
    System.out.println("13.startsWith");
    System.out.println("14.endsWith");
    System.out.println("15.trim");
    System.out.println("0.Exit");

    System.out.println("Enter your choice to perform a string operation:");
    int choice = sc.nextInt();

    switch(choice) {

      case 1:
        System.out.println("Enter str1 or str2 to print its length");
        int str1_or_str2 = sc.nextInt();

        switch(str1_or_str2) {

          case 1:
            System.out.println("Length: "+ str1.length());
            break;

          case 2:
            System.out.println("Length of str2: "+ str2.length());
            break;
        }
        break;

        case 2:

          System.out.println("Enter index value: ");
          int index = sc.nextInt();

          System.out.println("Character at index 1: " + str1.charAt(index));
          break;

        case 3:
          System.out.println("Equals: " + str1.equals("Hello Java"));
          System.out.println("Equals: "+ str2.equals("Java"));
          break;

        case 4:
          System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello java"));
          break;

        case 5:
          System.out.println("Substring: "+ str2.substring(3));
          break;

        case 6:
          System.out.println("Contains 'Java': " + str1.contains("Hello Java"));
          System.out.println("Contains 'Java': " + str2.contains("Java"));
          break;

        case 7:
          System.out.println("Replace: " + str1.replace("Hello Java", "Hello"));
          System.out.println("Replace: "+ str2.replace("Programming", "World"));
          break;
          
        case 8:
          System.out.println("Uppercase: " + str1.toUpperCase());
          System.out.println("Uppercase: " + str2.toUpperCase());
          break;

        case 9:
          System.out.println("Lowercase: " + str1.toLowerCase());
          System.out.println("Lowercase: " + str2.toLowerCase());
          break;

        case 10:
          System.out.println("Concatenation: "+ str1.concat(" Programming"));
          break;

        case 11:
          System.out.println("Index of 'Java': "+ str1.indexOf("Java"));
          break;

        case 12:
          System.out.println("Last index of 'Programming'" + str2.lastIndexOf("g"));
          break;

        case 13:
          System.out.println("Starts with 'Hello': " + str1.startsWith("Hello"));
          break;

        case 14:
          System.out.println("Ends with 'Java': " + str1.endsWith("Java"));
          break;

        case 15:
          System.out.println("Trim: '" + str2.trim() + "'");
          break;

        case 0:
          System.out.println("Exiting program..");

        default:
          System.out.println("Invalid choice.");
        
    }
  sc.close();

  }
}
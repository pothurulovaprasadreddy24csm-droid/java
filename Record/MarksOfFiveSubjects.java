public class MarksOfFiveSubjects {
    public static void main(String[] args) {

        if (args.length != 5) {
            System.out.println("Please enter marks of exactly five subjects.");
            return;
        }

        int total = 0;

        for (int i = 0; i < 5; i++) {
            total = total + Integer.parseInt(args[i]);
        }

        double average = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }
}
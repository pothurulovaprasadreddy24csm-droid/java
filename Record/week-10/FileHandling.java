import java.io.*;
import java.util.*;

public class FileHandling {

    public static void main(String[] args) {

        String text =
            "Peter Piper picked a peck of pickled peppers\n" +
            "A peck of pickled peppers Peter Piper picked\n" +
            "If Peter Piper picked a peck of pickled peppers\n" +
            "Where's the peck of pickled peppers Peter Piper picked?";

        try {

            FileWriter fw = new FileWriter("sample.txt");
            fw.write(text);
            fw.close();

            BufferedReader br =
                new BufferedReader(new FileReader("sample.txt"));

            int pe = 0;
            int pi = 0;
            String line;

            while ((line = br.readLine()) != null) {

                line = line.toLowerCase();

                for (int i = 0; i < line.length() - 1; i++) {

                    String pattern = line.substring(i, i + 2);

                    if (pattern.equals("pe"))
                        pe++;

                    if (pattern.equals("pi"))
                        pi++;
                }
            }

            br.close();

            System.out.println("'pe' - no of occurrences - " + pe);
            System.out.println("'pi' - no of occurrences - " + pi);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

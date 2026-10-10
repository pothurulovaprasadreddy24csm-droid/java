import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> colors = new LinkedHashSet<>();

        // add()
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");

        System.out.println("Colors: " + colors);

        // contains()
        System.out.println("Contains Green? " + colors.contains("Green"));
        System.out.println("Contains Black? " + colors.contains("Black"));

        // size()
        System.out.println("Number of colors: " + colors.size());

        // remove()
        colors.remove("Red");
        System.out.println("After removing Red: " + colors);

        // clear()
        colors.clear();
        System.out.println("After clear: " + colors);
    }
}
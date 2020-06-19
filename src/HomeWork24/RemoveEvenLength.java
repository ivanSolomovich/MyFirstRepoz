package HomeWork24;

import java.util.HashSet;
import java.util.Set;

public class RemoveEvenLength {
    public static void main(String[] args) {
        Set<String> inputset = new HashSet<>();
        inputset.add("foo");
        inputset.add("foo");
        inputset.add("buzz");
        inputset.add("bar");
        inputset.add("fork");
        inputset.add("bort");
        inputset.add("spoon");
        inputset.add("!");
        inputset.add("dude");

        System.out.println("Содержимое входного сета");
        for (String s : inputset) {
            System.out.println(s);
        }
        Set<String> outset = new HashSet<>();

        for (String s : inputset) {
            if (s.length() % 2 != 0) {
                outset.add(s);
            }

        }
        System.out.println("Содержимое выходного сета");
        for (String s : outset) {
            System.out.println(s);

        }
    }
}
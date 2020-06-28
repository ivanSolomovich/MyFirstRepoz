package HomeWork33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите строку");
        String s = input.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int current = map.get(c);
                map.put(c, current + 1);

            } else map.put(c, 1);

        }
        int max = 0;
        char c = 0;
        for (Map.Entry<Character, Integer> box : map.entrySet()) {
            if (box.getValue() > max) {
                max = box.getValue();
                c = box.getKey();
            }
        }

        System.out.println("Символ \"" + c + "\" Встречается в строке максимальное кол-во раз: " + max  );



    }
}


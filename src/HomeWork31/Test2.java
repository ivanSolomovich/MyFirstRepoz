package HomeWork31;

import java.util.Scanner;

public class Test2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите строку");
        String s = input.nextLine();
        String revers = new StringBuilder(s).reverse().toString();

        if (revers.equals(s) ) {
            System.out.println("Да, это полендром");
        } else {
            System.out.println("Нет, не полендром");
        }
    }
}

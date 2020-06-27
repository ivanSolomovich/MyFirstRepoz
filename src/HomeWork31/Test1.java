package HomeWork31;

import java.util.Scanner;

public class Test1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите строку");
        String s = input.nextLine();
        char[] charArray = s.toCharArray();

        boolean polendrom = true;



        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray[charArray.length - 1 -i] ){
                polendrom = false;
                break;
            }
        }
        if(polendrom == true){
            System.out.println("Да, это полендром");
        }
        else {
            System.out.println("Нет, не полендром");
        }
    }
}

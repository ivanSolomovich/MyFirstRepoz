package HomeWork8;


import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Выберите действие: ");
        System.out.println("1: Сложение ");
        System.out.println("2: Вычитание ");
        int choise = input1();
        System.out.println("Введите первое число");
        int x = input1();
        System.out.println("Введите второе число");
        int y = input1();


        switch (choise) {
            case 1: {
                int result = CalcUtils.summ(x,y);
                System.out.println("Результат сложения: " + result);
                break;
            }
            case 2: {
                int result2 = CalcUtils.summ2(x,y);
                System.out.println("Результат вычитания " + result2);
                break;
            }
            default: {
                System.out.println("Вы выбрали неверный номер!!!");
            }
        }
    }


    private static int input1() {
        Scanner in = new Scanner(System.in);
        int keyboardinput1 = in.nextInt();
        return keyboardinput1;
    }
}

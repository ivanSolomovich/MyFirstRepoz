package com.company;
import java.util.Scanner;


public class HomeWork4 {
    public static void main(String[] args) {

        int iter = input();
        int mnoj = input2();

        for (int i = 1; i < iter; i++) {
            int a = i * mnoj; //Здесь не правильная формула!
            System.out.println("Значение " + a);
        }
    }

    private static int input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество значений для арифметическое прогрессии: ");
        int keyboardinput1 = in.nextInt();
        return keyboardinput1;
    }
    private static int input2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Какой множитель будем использовать?: ");
        int keyboardinput1 = in.nextInt();
        return keyboardinput1;
    }
}



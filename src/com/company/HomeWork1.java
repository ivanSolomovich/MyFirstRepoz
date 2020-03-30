package com.company;

import java.util.Scanner;


public class HomeWork1 {
    public static void main(String[] args) {
        int pervoechislo = input1();
        int vtoroechicslo = input2();
        if (pervoechislo < vtoroechicslo) {
            System.out.println("Наименьшее из двух чисел " + pervoechislo);
        } else {
            System.out.println("Наименьшее из двух чисел " + vtoroechicslo);
        }
    }

    private static int input1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int keyboardinput1 = in.nextInt();
        return keyboardinput1;
    }

    private static int input2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int keyboardinput2 = in.nextInt();
        return keyboardinput2;
    }
}



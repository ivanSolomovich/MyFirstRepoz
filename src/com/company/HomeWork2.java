package com.company;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {


        int chislo = input();

        if (chislo > 0) {
            System.out.println("Число " + chislo + " => положительное");
        }
        if (chislo == 0) {
            System.out.println("Число " + chislo + " => равно нулю");
        }
        if (chislo < 0) {
            System.out.println("Число " + chislo + " => отрицательное");
        }

        if ((chislo % 2) == 0) {
            System.out.println("Число " + chislo + " => чётное");
        } else {
            System.out.println("Число " + chislo + " => нечётное");
        }
    }


    private static int input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int keyboardinput1 = in.nextInt();
        return keyboardinput1;
    }

}






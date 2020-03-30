package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWork4 {
    public static void main(String[] args) {

        int vvod = input();

        for (int i = 0; i < vvod; i++) {
            int n = 2;
            int a = i * n;
            System.out.println("Привет " + a);
        }
    }

    private static int input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int keyboardinput1 = in.nextInt();
        return keyboardinput1;
    }
}



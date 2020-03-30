package com.company;

import java.util.Scanner;

public class HomeworkHotCold {
    public static void main(String[] args) {

        int rnd = rnd(0, 100);
        int prevdistance = 0;
        int distance = 100;
        boolean exit = false;
        while (!exit) {
            int current = input();
            if (current == 0) {
                System.out.println("Вы вышли из программы");
                exit = true;

            } else {
                if (current == rnd) {
                    System.out.println("Угадали");
                    exit = true;


                } else {
                    distance = Math.abs(rnd - current);
                    if (distance < prevdistance) {
                        System.out.println("Горячо");

                    } else {
                        System.out.println("Холодно");
                    }
                    prevdistance = distance;

                }
            }
        }
    }

    public static int rnd(int min, int max) {
        max -= min;

        return (int) (Math.random() * ++max) + min;

    }

    private static int input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int keybordinput = in.nextInt();
        return keybordinput;
    }
}


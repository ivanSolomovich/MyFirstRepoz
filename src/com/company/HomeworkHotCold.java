package com.company;

import java.util.Scanner;

public class HomeworkHotCold {
    public static void main(String[] args) {
//        System.out.println((int)(Math.random()*100));
//         int min = 0;
//         int max = 100;
//         int rnd = rnd(min,max);

//        System.out.println("Псевдослучайное целое число " + rnd);
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

//enum Seasons
//{
//    Winter,
//    Spring,
//    Summer,
//    Autumn

//}
//public class Main {
//  public static void main(String[] agrs) {
//      System.out.println("Hello World");
//
//      int i = -1;
//      do {
//          i = i - 1;
//      }while (i>0);
//      System.out;
//
//      }
//  }

//    public static void main(String[] agrs) {
//        Seasons s = Seasons.Autumn;
//        switch (s) {
//            case Winter:
//                System.out.println("Зима"); break;
//            case Spring:
//                System.out.println("Весна");
//                break;
//            case Summer:
//                System.out.println("Лето");
//                break;
//            case Autumn:
//                System.out.println("ОСень");
//                break;
//            default:
//                System.out.println("Зима");
//                break;
//        }
//                for (int i=0; i<=6; i++)
//                    System.out.println(i);
//                int[] arr = {51, 136, 387};
//                for (int i=0; i<arr.length; i++)
//                    System.out.println(arr[i]);
//                for (int i:arr)
//                    System.out.println(i);

//        }
//    }


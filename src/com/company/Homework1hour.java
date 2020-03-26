package com.company;

import java.util.Scanner;

public class Homework1hour {
    public static void main(String[] args) {
        int second = 3600;
        int minutes = 60;




        System.out.println("Введите кол-во секунд");
        Scanner in = new Scanner(System.in);
        second = in.nextInt();
        System.out.println("Введите кол-во минут");
        minutes = in.nextInt();
        System.out.println("На выходе 60 минут(1-час)");
        System.out.println(second/minutes);





    }

    {

    }
}

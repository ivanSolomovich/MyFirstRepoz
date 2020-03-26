package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homeworkpetrol {
    public static void main(String[] args) {
        int price = 43;
        int count = 50;
        System.out.println("Введите стоимость бинзина");

        Scanner in = new Scanner(System.in);
        price = in.nextInt();

        System.out.println("Введите количество бензина");
        count = in.nextInt();
        int total = price*count;
        System.out.println("Стоимость бензина");
        System.out.println(total);






    }
}

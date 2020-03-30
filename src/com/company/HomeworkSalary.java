package com.company;

import java.util.Scanner;


public class HomeworkSalary {
    public static void main(String[] args) {
        int salaryGross = 70000;
        double tax = 0.13;
        System.out.println("Зарплата на руки");

        Scanner in = new Scanner(System.in);
        salaryGross = in.nextInt();
        System.out.println("Введите налог на зарплату 0,13");

        tax = in.nextDouble();
        double salaryNet = salaryGross * (1 - tax);

        System.out.println("Конечная зарплата");
        System.out.println(salaryNet);


    }

    {


    }
}

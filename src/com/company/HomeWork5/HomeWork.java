package com.company.HomeWork5;

public class HomeWork {


    public static void main(String[] args) {
        Settlement first = new Settlement("Первая", 20);
        Settlement second = new Village("Деревня", 25);
        Settlement two = new Town("Нью Йорк", 1000);


        first.havefun();
        second.havefun();
        two.havefun();


        first.addPopulation(100);
        System.out.println();
        second.addPopulation(100);
        second.addPopulation(150);
        System.out.println();
        two.addPopulation(1500);
        two.addPopulation(1300);
        two.addPopulation(1500);

    }
}

package com.company.HomeWork5;

public class Town extends Settlement {

    public Town(String inputname, int inputpopulation) {
        super(inputname, inputpopulation);
    }

    public void havefun() {
        System.out.println("Поход в бар");
    }

    public void addPopulation(int newPeople) {
        population = population + newPeople;
        System.out.println("Город увеличился на " + newPeople);
        System.out.println("Всего в городе живёт " + population);
    }
}


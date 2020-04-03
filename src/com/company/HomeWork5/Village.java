package com.company.HomeWork5;

public class Village extends Settlement {

    public Village(String inputname, int inputpopulation) {
        super(inputname, inputpopulation);


    }
    public void havefun(){
        System.out.println("Стриптиз Бар");
    }
    public void addPopulation(int newPeople) {
        if (population > 100 ){
            System.out.println("Перенаселение");
        }
        else {
            population = population + newPeople;
            System.out.println("Деревня увеличился на " + newPeople);
            System.out.println("Всего в деревне живёт " + population);
        }
    }
}

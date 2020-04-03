package com.company.HomeWork5;

public class Settlement {
    protected String name;
    protected int population;


    public Settlement(String inputname, int inputpopulation){
        name = inputname;
        population = inputpopulation;

    }
    public void havefun(){
        System.out.println("Карусель");
    }

    public void addPopulation(int newPeople){
        System.out.println("Для поселения данный метод не работает");

    }

    @Override
    public String toString() {
        return "Settlement{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }


    public static void main(String[] args) {
        Settlement Ivanovka = new Settlement("Ивановка " , 300);
        System.out.println(Ivanovka.toString());
    }
}

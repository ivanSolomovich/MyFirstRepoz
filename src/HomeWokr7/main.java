package HomeWokr7;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

enum Drink {
    CocaCola("CocaColca", 50),
    Sprite("Sprite", 55),
    Mirinda("Mirinda", 75),
    Pepsi("Pepsi", 45);


    String name;
    int price;

    Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }
}

class Main {
    static Scanner input = new Scanner(System.in);
    static boolean endChoise = false;
    static Drink[] assortment = Drink.values();
    static int money = 0;

    private final static Logger myLogger = Logger.getLogger("NameMyLogger");


    public static void main(String[] args) {
        FileHandler fh;

        try {

            // This block configure the logger with handler and formatter
            fh = new FileHandler("MyLogFile.log");
            myLogger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages
            myLogger.info("My first log");

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        myLogger.info("Hi How r u?");

        myLogger.log(Level.INFO, "Начало работы программы");
        greeting();
        while (!endChoise) {
            switch (input.nextInt()) {
                case 1:
                    choiseProduct();
                    endChoise = false;
                    break;
                case 2:
                    viewMenu();
                    break;
                case 3:
                    enterMoney();
                    break;
                case 4:
                    endChoise = true;
                    break;
                default:
                    myLogger.log(Level.WARNING, "Пожалуйста выберите один из пунктов меню.");
                    break;
            }
            myLogger.log(Level.INFO, "На счету: " + money + " руб.");
        }
    }

    static void greeting() {
        myLogger.log(Level.INFO, "Чтобы купить напиток - нажмите 1.");
        myLogger.log(Level.INFO, "Чтобы посмотреть меню напитков - нажмите 2.");
        myLogger.log(Level.INFO, "Чтобы внести деньги на внутренний счёт - нажмите 3.");
        myLogger.log(Level.INFO, "Чтобы выйти - нажмите 4.");
    }

    static void choiseProduct() {
        while (true) {
            textMenuOfChoiseProduct();
            int choiseOfPerson = input.nextInt();
            if (choiseOfPerson == assortment.length)
                break;
            for (int i = 0; i < assortment.length; i++) {
                if (choiseOfPerson == i) {
                    buyProduct(choiseOfPerson);
                    endChoise = true;
                    break;
                }
            }
            if (endChoise)
                break;
            else
                myLogger.log(Level.INFO, "Пожалуйста сделайте выбор.");
        }
    }

    static void textMenuOfChoiseProduct() {
        myLogger.log(Level.INFO, "Выберите один из продуктов:");
        for (int i = 0; i < assortment.length; i++) {
            myLogger.log(Level.INFO, i + ". " + assortment[i].getName());
        }
        myLogger.log(Level.INFO, assortment.length + ". Выйти");
    }

    static void buyProduct(int number) {
        if (money >= assortment[number].getPrice()) {
            money = money - assortment[number].getPrice();
            myLogger.log(Level.INFO, "Благодарим за покупку.");
        } else
            myLogger.log(Level.INFO, "На вашем счёте недостаточно средств.");
    }

    static void viewMenu() {
        myLogger.log(Level.INFO, "В ассортименте имеется:");
        for (Drink i : assortment) {
            myLogger.log(Level.INFO, i.getName() + " стоимостью: " + i.getPrice() + " руб.");
        }
    }

    static void enterMoney() {
        myLogger.log(Level.INFO, "Введите сколько хотите внести денег:");
        money = money + input.nextInt();
    }
}

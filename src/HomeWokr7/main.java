package HomeWokr7;

import java.util.Scanner;

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

        public static void main(String[] args) {
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
                        System.out.println("Пожалуйста выберите один из пунктов меню.");
                        break;
                }
                System.out.println("На счету: " + money + " руб.");
            }
        }

        static void greeting() {
            System.out.println("Чтобы купить напиток - нажмите 1.");
            System.out.println("Чтобы посмотреть меню напитков - нажмите 2.");
            System.out.println("Чтобы внести деньги на внутренний счёт - нажмите 3.");
            System.out.println("Чтобы выйти - нажмите 4.");
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
                    System.out.println("Пожалуйста сделайте выбор.");
            }
        }

        static void textMenuOfChoiseProduct() {
            System.out.println("Выберите один из продуктов:");
            for (int i = 0; i < assortment.length; i++) {
                System.out.println(i + ". " + assortment[i].getName());
            }
            System.out.println(assortment.length + ". Выйти");
        }

        static void buyProduct(int number) {
            if (money >= assortment[number].getPrice()) {
                money = money - assortment[number].getPrice();
                System.out.println("Благодарим за покупку.");
            } else
                System.out.println("На вашем счёте недостаточно средств.");
        }

        static void viewMenu() {
            System.out.println("В ассортименте имеется:");
            for (Drink i : assortment) {
                System.out.println(i.getName() + " стоимостью: " + i.getPrice() + " руб.");
            }
        }

        static void enterMoney() {
            System.out.println("Введите сколько хотите внести денег:");
            money = money + input.nextInt();
        }
    }

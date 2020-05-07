package HomeWork13;

import static HomeWork13.Food.*;

public class Mother {
    public static void main(String[] args) {
        Food[] food = {SOUP, SAUSAGE, PORRIDGE, APPLE, CARROT, PANCAKES};
        Child child = new Child();

        System.out.println("Кушай наздоровье, приятного аппетита!");
        System.out.println();
        for (Food f : food) {
            try {
                child.tasteDish(f);
            } catch (ChildDissatisfiedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("Падаю в конвульсиях: Спасибо! Переел");
    }
}
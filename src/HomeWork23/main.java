package HomeWork23;

import java.io.*;
import java.util.logging.*;

class Main {

    public static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        LogManager.getLogManager().reset();
        log.setLevel(Level.ALL);

        try {
            FileHandler fileHandler = new FileHandler("Lesson23.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            log.addHandler(fileHandler);
        }catch (IOException e){
            System.err.println("Логирование не работает " + e);
        }

        MyBasket basketArrayList = new MyBasket();
        System.out.println("Add product:");
        basketArrayList.addProduct("Ветровка", 2);
        log.log(Level.INFO, "В корзину добавлена Ветровка в количестве - 2 шт.");
        basketArrayList.addProduct("Штаны", 3);
        log.log(Level.INFO, "В корзину добавлены Штаныв количестве - 3 шт.");
        basketArrayList.addProduct("Перчатки", 2);
        log.log(Level.INFO, "В корзину добавлены перчатки в количестве - 2 шт.");
        basketArrayList.addProduct("Шарф", 1);
        log.log(Level.INFO, "В корзину добавлен шарф в количестве - 1 шт.");
        basketArrayList.getProducts();

        System.out.println("Update product quantity:");
        basketArrayList.updateProductQuantity("Брюки", 1);
        log.log(Level.INFO, "В корзине обновили количество ветровок до 1");
        basketArrayList.getProducts();

        System.out.println("Remove product:");
        basketArrayList.removeProduct("Ветровка");
        log.log(Level.INFO, "Из корзины удалили Рубашки");
        basketArrayList.getProducts();

        basketArrayList.clear();
        log.log(Level.INFO, "Очистили корзину");

        basketArrayList.getProductQuantity("Штаны");
        log.log(Level.INFO, "Корзина пуста");
        basketArrayList.getProducts();
    }
}
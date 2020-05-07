package HomeWork9;

public class Launcher {
    public static void main(String[] args) {
        Animal x = new dog("Тузик", "Собака");
        Animal y = new cat("Толстяк", "Кот");
        ((dog) x).bark();
        x.display();
        y.display();


        Swimable a = new Duck("Кряка");
        ((Duck) a).display();
        ((Duck) a).fly();
        a.swim();
        ((Duck) a).run();


        Human borya = new Sportsman("Borya");
        borya.run();
        borya.swim();


        Human vasya = new LazyAss("Vasya");
        vasya.swim();
        vasya.run();
    }


}



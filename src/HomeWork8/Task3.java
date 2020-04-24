package HomeWork8;

public class Task3 {
    public static void main(String[] args) {
        int count = objectCaunter.getCount();
        System.out.println("Кол-во обьектов: " + count);
        new objectCaunter();
        new objectCaunter();
        new objectCaunter();
        count = objectCaunter.getCount();
        System.out.println("Кол-во обьектов: " + count);

    }
}

package HomeWork9;

public class Duck extends Animal implements Flyable, Swimable {

    public Duck(String TheNickNameOfTheAnimal) {
        super(TheNickNameOfTheAnimal);
    }

    public void display() {
        System.out.printf("typeOfAnimal duck:  \t duck: %s \n ", super.getName());

    }

    @Override
    public void fly() {
        System.out.println("Утка взлетела");
    }

    @Override
    public void swim() {
        System.out.println("Утка поплыла");
    }
}




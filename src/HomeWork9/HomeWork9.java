package HomeWork9;


abstract class Animal {

    private String TheNickNameOfTheAnimal;

    public String getName() {
        return TheNickNameOfTheAnimal;
    }

    public Animal(String TheNickNameOfTheAnimal) {
        this.TheNickNameOfTheAnimal = TheNickNameOfTheAnimal;

    }

    public abstract void display();
}


class dog extends Animal {
    private String TheNickNameOfTheAnimal;

    public dog (String name, String typeAnimal) {
        super(name);
        this.TheNickNameOfTheAnimal = typeAnimal ;
    }
public void bark(){
    System.out.println("Bark-Bark");
}
    public void display() {
        System.out.printf("typeOfAnimal dog: %s \t dog: %s \n ", super.getName(), TheNickNameOfTheAnimal);
    }
}

class cat extends Animal {
    private String TheNickNameOfTheAnimal;

    public cat(String TheNickNameOfTheAnimal, String typeAnimal) {
        super(TheNickNameOfTheAnimal);
        this.TheNickNameOfTheAnimal = typeAnimal;
    }

    public void display() {
        System.out.printf("typeOfAnimal cat: %s \t cat: %s \n ", super.getName(), TheNickNameOfTheAnimal);
    }
}

package HomeWork9;

public class LazyAss extends Human {

    public LazyAss(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Не хочу");
    }

    @Override
    public void swim() {
        System.out.println(" Не буду");

    }
}

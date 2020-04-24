package HomeWork8;

public class objectCaunter {
    private static int count = 0;
    public static int getCount(){
        return count;
    }

    public objectCaunter() {
        count = count + 1;
    }
}

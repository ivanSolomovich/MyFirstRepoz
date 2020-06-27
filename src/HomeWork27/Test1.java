package HomeWork27;

public class Test1 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int fib = 0, i = 1;
        while (i < 9) {
            System.out.println(i + " Число фибаначи = " + fib);
            fib = a + b;
            a = b;
            b = fib;
            i++;
        }
    }
}

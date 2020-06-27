package HomeWork27;

public class Test1 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int fib = 0, i = 2;
        System.out.println(1 + " Число фибаначи = " + a);
        System.out.println(2 + " Число фибаначи = " + b);
        while (i < 9) {
            fib = a + b;
            System.out.println(i + " Число фибаначи = " + fib);
            a = b;
            b = fib;
            i++;
        }
    }
}

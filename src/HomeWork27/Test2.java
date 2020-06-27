package HomeWork27;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 1; i<= 9; i++){
            System.out.println(i+ " Число фибаначи =  " + fibonacci(i) );
        }
    }
    private static int fibonacci(int index) {
        if (index == 1)
            return 0;
        if (index == 2)
            return 1;
        return fibonacci(index - 1) + fibonacci(index - 2);

    }
}

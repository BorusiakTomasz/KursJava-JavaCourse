package pp.D007_12_07;
import java.util.Scanner;

/**
 * Created by Miver on 2017-07-12.
 */

public class Application {
    public static int fibo(int n) {
        int fib1 = 0;
        int fib2 = 1;
        int wynik = 0;

        for(int i = 1; i<n; i++) {
            wynik = fib1 + fib2;
            fib1 = fib2;
            fib2 = wynik;
        }
        return wynik;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Fibonacci string");
        System.out.println();

        System.out.println("Program number");
        byte x = sc.nextByte();
        System.out.println();

        switch(x) {
            case 1:
                System.out.println("Enter number of fibonacci string");
                System.out.println("N ty wyraz ciagu to: "+fibo(sc.nextInt()));
                break;
            default:
                System.out.println("Don't ready yet.");
                break;
        }
    }
}

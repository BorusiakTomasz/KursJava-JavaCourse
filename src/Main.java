import oop.D013_20_07.BinomialSolver;

import java.util.Scanner;

/**
 * Created by Miver on 2017-07-13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wielomian: Ax^2 + Bx + C");

        System.out.println("A:");
        double a = sc.nextDouble();

        System.out.println("B:");
        double b = sc.nextDouble();

        System.out.println("C:");
        double c = sc.nextDouble();

        BinomialSolver bs = new BinomialSolver(a, b, c);
        System.out.println();

        bs.count();
        System.out.println();

        System.out.println("Oblicz wielomian dla x");
        System.out.println(bs.calculate(sc.nextDouble()));
    }
}

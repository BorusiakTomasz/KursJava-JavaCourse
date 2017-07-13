import oop.D008_13_07.Point;

import java.util.Scanner;

/**
 * Created by Miver on 2017-07-13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point punkt = new Point();
        int[] tab = new int[2];

        System.out.println("Podaj nazwe punktu");
        String nazwa = sc.nextLine();
        System.out.println();

        System.out.println("Podaj wspolrzedne");
        System.out.println("x");
        tab[0] = sc.nextInt();
        System.out.println("y");
        tab[1] = sc.nextInt();
        System.out.println();

        punkt.getPoint(nazwa, tab[0], tab[1]);
        punkt.showPoint();
        System.out.println();

        System.out.println("Odleglosc od poczatku ukladu wspolrzednych");
        System.out.println(punkt.distanceFromOrigin());
    }
}

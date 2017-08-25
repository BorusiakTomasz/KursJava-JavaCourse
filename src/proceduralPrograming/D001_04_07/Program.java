package proceduralPrograming.D001_04_07;
import java.util.Scanner;

/**
 * Created by Miver on 2017-07-04.
 *
 * Ctrl + p - wypisywanie parametrow
 * sout - System.out.println();
 */
public class Program {
    public static void moje() {
        System.out.println("czesc");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello World");

        int a = 20, b = 5;
        System.out.println(a+b); //dodawanie
        System.out.println(a-b); //odejmowanie
        System.out.println(a*b); //mnozenie
        System.out.println(a/b); //dzielenie

        moje();

        System.out.println(a == b ? "Bingo" : "No raczej nie");
        System.out.println();

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println();
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println();

        //wreszcie wczytanie zmiennej
        System.out.print("Podaj imie: ");
        String imie = sc.nextLine();
        System.out.println("Witaj, "+imie);
    }
}

package proceduralPrograming.D004_07_07;
import java.util.Scanner;

/**
 * Created by Miver on 2017-07-07.
 * Poczytac o Zlorzonosci obliczeniowej - podpowiedz prowadzacego
 * Ogarnac sortowanie przez scalanie (ang. merge sort)
 */
public class Silnia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj n (obliczanie silni)");
        int n = sc.nextInt();

        int wynik = 1;
        for(int i = 1; i <= n; i++) {
            wynik *= n;
        }
        System.out.println("Wynik to: "+wynik);
    }
}

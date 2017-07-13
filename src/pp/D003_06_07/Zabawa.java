package pp.D003_06_07;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Miver on 2017-07-06.
 */
public class Zabawa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gen = new Random();

        System.out.println("Podaj poziom trudnosci 1..100");
        byte a = sc.nextByte();

        int[] tab = new int[a];
        for(int i = 0; i < a; i++) tab[i] = gen.nextInt(100);
        int max = tab[0];

        int licznik = 0;
        while(true) {
            System.out.println("Podaj liczbe");
            int liczba = sc.nextInt();

            for (int i = 0; i < a; i++) {
                if (liczba == tab[i]) {
                    System.out.println("Jest");
                    licznik++;
                    break;
                }
            }
            if(licznik == 1) break;
        }

        for(int i = 0; i < a; i++) if(tab[i] > max) max = tab[i];
        System.out.println("Max: "+max);
    }
}

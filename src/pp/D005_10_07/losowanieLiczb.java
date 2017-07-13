package pp.D005_10_07;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Miver on 2017-07-10.
 */
public class losowanieLiczb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int[] tab = new int[30];

        for (int i = 0; i < tab.length; i++)
            tab[i] = ran.nextInt(100);


        System.out.println("Podaj liczbe - sprawdze");
        int liczba = sc.nextInt();
        System.out.println();

        /*int j = 0;
        for (int i = 0; i < tab.length; i++)
            if (liczba == tab[i])
                System.out.println("Trafiles: " + (++j));
            else
                System.out.println((i + 1) + ": " + tab[i]);*/

        boolean czyObeacna = false;
        for(int i = 0; i<tab.length; i++)
            if (tab[i] == liczba) {
                czyObeacna = true;
                break;
            }

        if (czyObeacna)
            System.out.println("Mam taka liczbe");
        else
            System.out.println("Nie mam takiej liczby");
    }
}

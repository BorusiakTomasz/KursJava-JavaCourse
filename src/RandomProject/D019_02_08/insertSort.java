package RandomProject.D019_02_08;

import java.util.Scanner;

/**
 * Created by Miver on 2017-08-02.
 */
public class insertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Wprowadz ilosc elementow do posortowania
        System.out.println("Podaj wielkosc tablicy");
        int x = sc.nextInt();

        int[] tab = new int[x];

        //Wprowadz elementy do posortowania
        for (int i = 0; i < x; i++) {
            System.out.println("Podaj " + (i+1) + " element");
            tab[i] = sc.nextInt();
        }

        //Posortuj - insertSort
        for (int i = 0; i < tab.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (tab[j] < tab[j+1]) {
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                } else break;
            }
        }

        //Wyswietl posortowana tablice
        for (int i : tab) {
            System.out.println(i);
        }
    }
}

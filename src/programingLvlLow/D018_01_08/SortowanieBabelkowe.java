package programingLvlLow.D018_01_08;

import java.util.Scanner;

/**
 * Created by Miver on 2017-08-01.
 */
public class SortowanieBabelkowe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ilosc elementow");
        int a = sc.nextInt();

        int[] tab = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.println("Podaj " + (i + 1) + " element");
            tab[i] = sc.nextInt();
        }

        for (int i = a; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < a; i++) {
            if (i < a-1) System.out.print(tab[i] + ", ");
            else System.out.print(tab[i]);
        }
    }
}

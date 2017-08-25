package proceduralPrograming.D005_10_07;
import java.util.Scanner;

/**
 * Created by Miver on 2017-07-10.
 */
public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Prosty przyklad petli foreach");
        System.out.println("2. Zad 1: Podaj n liczb i je wyswietl");
        System.out.println("3. Zad 2: Podaj n liczb, wyswietl ich kwadraty");
        System.out.println("4. Max");
        System.out.println("5. Tablice wielowymiarowe");
        System.out.println();

        System.out.println("Jaki program chcesz uruchomic");
        byte x = sc.nextByte();
        System.out.println();

        switch (x) {
            case 1:
                int[] tab = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

                //petle foreach
                int wynik = 0;
                for (int elem : tab) {
                    System.out.println(elem);
                    wynik += elem;
                }
                System.out.println("Suma elementow to" + wynik);
                break;
            case 2:
                int wielkosc;
                while (true) {
                    System.out.println("Ile chcesz liczb");
                    wielkosc = sc.nextInt();

                    if (wielkosc >= 30 && wielkosc < 0) {
                        System.out.println("Chcesz zbyt wiele, sprobuj jeszcze raz");
                    } else break;
                }
                System.out.println();

                double[] tab1 = new double[wielkosc];
                for (int i = 0; i < wielkosc; i++) {
                    System.out.println("Podaj " + (i + 1) + " element");
                    double elem = sc.nextDouble();
                    tab1[i] = elem;
                }
                System.out.println();

                System.out.println("Elementami tablicy sa:");
                for (double elem : tab1) {
                    System.out.println(elem);
                }
                break;
            case 3:
                System.out.println("Ile chcesz liczb");

                double[] tab2 = new double[sc.nextShort()];
                System.out.println();

                for (int i = 0; i < tab2.length; i++) {
                    System.out.println("Podaj " + (i + 1) + " element");
                    double liczba = sc.nextDouble();
                    tab2[i] = liczba * liczba;
                }
                System.out.println();

                System.out.println("Elementy do kwadratu");
                for (double i : tab2)
                    System.out.println(i);
                break;
            case 4:
                System.out.println("Ile chcesz liczb");
                double[] tab3 = new double[sc.nextInt()];
                System.out.println();

                double max = tab3[0];
                for (int i = 0; i < tab3.length; i++) {
                    System.out.println("Podaj " + i + " element");
                    tab3[i] = sc.nextDouble();

                    if (tab3[i] > max) max = tab3[i];
                }
                System.out.println();

                System.out.println("Najwiekszy element to: " + max);
                System.out.println();

                System.out.println("Sposrod takich liczb");
                for (double i : tab3)
                    System.out.println(i);
                break;
            case 5:
                System.out.println("Podaj ilosc kolumn");
                int x1 = sc.nextInt();

                System.out.println("Podaj ilosc wierszy");
                int y1 = sc.nextInt();

                int[][] tab4 = new int[y1][x1];
                System.out.println();

                for (int i = 0; i < y1; i++) {
                    for (int j = 0; j < x1; j++) {
                        System.out.println("Podaj element o wspolrzednych [" + i + ", " + j + "] ");
                        tab4[i][j] = sc.nextInt();
                    }
                    System.out.println();
                }
                System.out.println();

                for (int i = 0; i < tab4.length; i++) {
                    for (int j = 0; j < tab4[i].length; j++) {
                        System.out.print(tab4[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Nie napisalem jeszcze tego programu");
                break;
        }
    }
}

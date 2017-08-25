package objectOrientedPrograming.D011_18_07;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Miver on 2017-07-18.
 */
public class Matrix {
    private int[][] tab;
    private Scanner sc = new Scanner(System.in);

    public Matrix() { tab = new int[3][3]; }

    public Matrix(int A, int B) { tab = new int[A][B]; }

    public void printMatrix() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++)
                System.out.print(tab[i][j] + "\t");
            System.out.println();
        }
    }

    public void initializeMatrix() {
        System.out.println("Podaj elementy macierzy");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.println("Podaj [" + i + "][" + j + "]");
                tab[i][j] = sc.nextInt();
            }
        }
    }

    public void randomMatrix() {
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = rand.nextInt(1000);
            }
        }
        System.out.println("Macirz zostala utworzona");
    }

    public Matrix addMatrix(Matrix m) {
        Matrix wynik = new Matrix();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                wynik.tab[i][j] = tab[i][j] + m.tab[i][j];
                //System.out.print(wynik.tab[i][j] + "\t");
            }
            //System.out.println();
        }
        return wynik;
    }

    public Matrix substractMatrix(Matrix m) {
        Matrix wynik = new Matrix();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                wynik.tab[i][j] = tab[i][j] - m.tab[i][j];
                //System.out.print(wynik.tab[i][j] + "\t");
            }
            //System.out.println();
        }
        return wynik;
    }
}

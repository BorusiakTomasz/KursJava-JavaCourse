package objectOrientedPrograming.D011_18_07;

/**
 * Created by Miver on 2017-07-18.
 */
public class MainMatrix {
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        m1.initializeMatrix();
        System.out.println();

        System.out.println("Pierwsza macierz");
        m1.printMatrix();
        System.out.println();

        Matrix m2 = new Matrix();
        m2.randomMatrix();
        System.out.println();

        System.out.println("Druga macierz");
        m2.printMatrix();
        System.out.println();

        System.out.println("Wynik dodawania");
        m1.addMatrix(m2).printMatrix();
        System.out.println();

        System.out.println("Wynik odejmowania");
        m1.substractMatrix(m2).printMatrix();
    }
}

package oop.D011_18_07;

/**
 * Created by Miver on 2017-07-18.
 */
public class MainMatrix {
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        m1.initializeMatrix();
        m1.printMatrix();

        Matrix m2 = new Matrix();
        m2.initializeMatrix();
        m2.printMatrix();
        
        m1.addMatrix(m2).printMatrix();
        m1.lessMatrix(m2).printMatrix();
    }
}

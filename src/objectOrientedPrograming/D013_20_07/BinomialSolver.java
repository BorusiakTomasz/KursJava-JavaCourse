package objectOrientedPrograming.D013_20_07;

/**
 * Created by Miver on 2017-07-20.
 */
public class BinomialSolver {
    private double a;
    private double b;
    private double c;

    public BinomialSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void count() {
        double x1;
        double x2;
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("x = " + x1);
        } else
            System.out.println("Delta ujemna, brak miejsc zerowych");
    }

    public double calculate(double x) {
        return Math.pow(x, 2) * a + x * b + c;
    }
}

package objectOrientedPrograming.D012_19_07;

/**
 * Created by Miver on 2017-07-19.
 */
public class Ractangle {
    private double a;
    private double b;

    public Ractangle() {
        this.a = 0;
        this.b = 0;
    }

    public Ractangle(double a) {
        this();
        this.a = a;
    }

    public Ractangle(double a, double b) {
        this(a);
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}

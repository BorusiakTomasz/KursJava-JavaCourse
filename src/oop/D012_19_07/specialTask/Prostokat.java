package oop.D012_19_07.specialTask;

/**
 * Created by Miver on 2017-07-19.
 */
public class Prostokat extends Figura {
    private double a;
    private double b;

    public Prostokat() {
        super();
    }

    public Prostokat(double a) {
        super(a);
    }

    public Prostokat(double a, double b) {
        super(a);
        this.b = b;
    }

    public double obliczPole() {
        return a * b;
    }

    public double obliczObwod() {
        return (2 * a) + (2 * b);
    }
}

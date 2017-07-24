package oop.D012_19_07.specialTask;

/**
 * Created by Miver on 2017-07-19.
 */
public class Prostokat extends Figura {
    private double b;

    public Prostokat(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    public double obliczPole() { return getA() * b; }

    @Override
    public double obliczObwod() { return (2 * getA()) + (2 * b); }

    @Override
    public void opisz() {
        System.out.println("Prostokat");
    }
}

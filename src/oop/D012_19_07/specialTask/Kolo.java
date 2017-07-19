package oop.D012_19_07.specialTask;

/**
 * Created by Miver on 2017-07-19.
 */
public class Kolo extends Figura{
    private double r;

    public Kolo(double r) {
        super(r);
    }

    public double obliczPole() {
        return Math.PI * r * r;
    }

    public double obliczObwod() {
        return 2 * Math.PI * r;
    }
}

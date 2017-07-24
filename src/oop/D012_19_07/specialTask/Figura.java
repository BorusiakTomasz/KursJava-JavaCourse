package oop.D012_19_07.specialTask;

/**
 * Created by Miver on 2017-07-19.
 */
public abstract class Figura {
    private double a;

    protected Figura(double a) { this.a = a; }

    public abstract double obliczPole();

    public abstract double obliczObwod();
}

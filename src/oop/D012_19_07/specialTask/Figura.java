package oop.D012_19_07.specialTask;

/**
 * Created by Miver on 2017-07-19.
 */
abstract class Figura {
    private double a;

    protected Figura() {
        this.a = 0;
    }

    protected Figura(double a) {
        this();
        this.a = a;
    }

    protected double getA() {
        return a;
    }

    protected void setA(double a) {
        this.a = a;
    }

    abstract double obliczPole();

    abstract double obliczObwod();
}

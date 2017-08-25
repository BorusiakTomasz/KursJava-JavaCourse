package objectOrientedPrograming.D012_19_07.specialTask;

/**
 * Created by Miver on 2017-07-19.
 */
public class Kolo extends Figura{
    public Kolo(double r) { super(r); }

    @Override
    public double obliczPole() { return Math.PI * getA() * getA(); }

    @Override
    public double obliczObwod() { return 2 * Math.PI * getA(); }

    @Override
    public void opisz() {
        System.out.println("Kolo");
    }
}

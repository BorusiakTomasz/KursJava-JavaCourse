package oop.D012_19_07.specialTask;

/**
 * Created by Miver on 2017-07-24.
 */
public class Trapez extends Figura {
    private double gornaPodstawa, lewyBok_boki, prawyBok_wysokosc;

    public Trapez(double dolnaPodstawa, double gornaPodstawa, double lewyBok_boki, double prawyBok_wysokosc) {
        super(dolnaPodstawa);
        this.gornaPodstawa = gornaPodstawa;
        this.lewyBok_boki = lewyBok_boki;
        this.prawyBok_wysokosc = prawyBok_wysokosc;
    }

    @Override
    public double obliczPole() { return (getA() + gornaPodstawa) * prawyBok_wysokosc / 2; }

    @Override
    public double obliczObwod() {
        if(prawyBok_wysokosc != 0)
            return getA() + gornaPodstawa + lewyBok_boki + prawyBok_wysokosc;
        else
            return getA() + gornaPodstawa + 2*lewyBok_boki;
    }
}

package oop.D012_19_07.specialTask;

/**
 * Created by Miver on 2017-07-24.
 */
public class Trapez extends Figura {
    private double dolnaPodstawa, gornaPodstawa, lewyBok_boki, prawyBok_wysokosc;

    public Trapez(double dolnaPodstawa, double gornaPodstawa, double lewyBok_boki, double prawyBok_wysokosc) {
        super(dolnaPodstawa);
        this.gornaPodstawa = gornaPodstawa;
        this.lewyBok_boki = lewyBok_boki;
        this.prawyBok_wysokosc = prawyBok_wysokosc;
    }

    @Override
    public double obliczPole() { return (dolnaPodstawa + gornaPodstawa) * prawyBok_wysokosc / 2; }

    @Override
    public double obliczObwod() {
        if(prawyBok_wysokosc != 0)
            return dolnaPodstawa + gornaPodstawa + lewyBok_boki + prawyBok_wysokosc;
        else
            return dolnaPodstawa + gornaPodstawa + 2*lewyBok_boki;
    }
}

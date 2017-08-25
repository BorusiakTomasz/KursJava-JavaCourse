package objectOrientedPrograming.D016_25_07;

/**
 * Created by Miver on 2017-07-25.
 */
public class KontoOszeczednosciowe implements Konto {
    private double bilans;

    public KontoOszeczednosciowe(double bilans) {
        this.bilans = bilans;
    }

    @Override
    public void wplata(double kwota) {
        if (kwota < 0)
            throw new IllegalArgumentException("Nie mozna wplacic ujemnej kwoty");
        bilans += kwota;
    }

    @Override
    public double wyplata(double kwota) throws Exception {
        if (kwota > bilans)
            throw new Exception("Nie posiadasz wystarczajacych srodkow");
        bilans -= kwota;
        return kwota;
    }

    @Override
    public double getBalans() {
        return bilans;
    }
}

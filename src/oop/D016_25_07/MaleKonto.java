package oop.D016_25_07;

/**
 * Created by Miver on 2017-07-25.
 */
public class MaleKonto extends KontoOszeczednosciowe {
    private double prog;

    public MaleKonto(double bilans, double prog) {
        super(bilans);
        this.prog = prog;
    }

    @Override
    public double wyplata(double kwota) throws Exception {
        if (kwota > prog)
            throw new Exception("Kwota wieksza niz limit");
        return super.wyplata(kwota);
    }
}

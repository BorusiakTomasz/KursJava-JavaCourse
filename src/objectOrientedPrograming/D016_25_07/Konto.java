package objectOrientedPrograming.D016_25_07;

/**
 * Created by Miver on 2017-07-25.
 */
public interface Konto {
    void wplata(double kwota);
    double wyplata(double kwota) throws Exception;
    double getBalans();
}

import oop.D009_14_07.Firma;
import oop.D009_14_07.Pracownik;

/**
 * Created by Miver on 2017-07-13.
 */
public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma();
        Pracownik pracownik = new Pracownik();

        firma.setPracownik(pracownik);

        firma.getPracownicyFirmy();
    }
}

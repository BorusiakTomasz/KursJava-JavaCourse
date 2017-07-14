package oop.D009_14_07;

/**
 * Created by Miver on 2017-07-14.
 */
public class Firma extends Pracownik {
    private Pracownik[] pracownicy = new Pracownik[100];

    private int LiczbaPracownikow;

    public Firma() {
        LiczbaPracownikow = 0;
    }

    public void getPracownicyFirmy() {
        System.out.println("Lista pracownikow");
        System.out.println();

        for(int i = 0; i < LiczbaPracownikow; i++) {
            System.out.println("ID: " + i);
            pracownicy[i].getPracownik();
        }
    }

    public void setPracownik(Pracownik osoba) {
        pracownicy[LiczbaPracownikow] = osoba.setPracownik();
        LiczbaPracownikow++;
    }
}

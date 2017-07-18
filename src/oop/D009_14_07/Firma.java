package oop.D009_14_07;

/**
 * Created by Miver on 2017-07-14.
 */
public class Firma {
    private Pracownik[] pracownicy;
    private int LiczbaPracownikow;

    public Firma() {
        pracownicy = new Pracownik[100];
        LiczbaPracownikow = 0;
    }

    public void getPracownicyFirmy() {
        System.out.println("Lista pracownikow");
        System.out.println();

        for (int i = 0; i < LiczbaPracownikow; i++) {
            System.out.println("ID: " + i);
            pracownicy[i].getPracownik();
        }
    }

    public void getPracownicyFirmy(int id) {
        if (id < LiczbaPracownikow && id >= 0)
            pracownicy[id].getPracownik();
    }

    public void setPracownikFirmy(Pracownik osoba) {
        pracownicy[LiczbaPracownikow] = osoba.setPracownik();
        LiczbaPracownikow++;
    }

    public void delPracownikFirmy(int id) {
        pracownicy[id] = null;
        LiczbaPracownikow--;
    }
}

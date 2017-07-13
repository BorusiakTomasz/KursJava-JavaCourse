package oop.D008_13_07;

/**
 * Created by Miver on 2017-07-13.
 */
public class Pracownik {
    //Deklaracja pola w klasie
    public String imie;
    public String nazwisko;
    public int wiek;
    public float pensja;

    //Konstruktor
    public Pracownik() {
        imie = "Tomek";
        nazwisko = "B";
        wiek = 20;
        pensja = 4000;
    }

    public Pracownik(String imie, String nazwisko, int wiek, float pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pensja = pensja;
    }

    //metoda klasy Pracownik
    public void opis() {
        System.out.println("Pracownik");
    }

    public void opiszPracownika() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Pensja: " + pensja);
        System.out.println();
    }
}

package oop.D013_20_07.inheritance;

/**
 * Created by Miver on 2017-07-20.
 */
public class Pracownik extends Person {
    private double pensja;
    private String stanowisko;

    public Pracownik() {

    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
}

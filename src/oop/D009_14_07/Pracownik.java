package oop.D009_14_07;

import java.util.Scanner;

/**
 * Created by Miver on 2017-07-14.
 */
public class Pracownik {
    private String imie; //name
    private String nazwisko; //surName
    private int placa; //salary
    private char plec; //sex
    private int dzial; //section

    public Pracownik() {
        imie = null;
        nazwisko = null;
        placa = 0;
        plec = ' ';
        dzial = 0;
    }

    Pracownik setPracownik() {
        Scanner sc = new Scanner(System.in);
        Pracownik osoba = new Pracownik();

        System.out.println("Podaj dane pracownika");
        System.out.println("Imie");
        osoba.imie = sc.nextLine();

        System.out.println("Nazwisko");
        osoba.nazwisko = sc.nextLine();

        System.out.println("Placa");
        osoba.placa = sc.nextInt();

        System.out.println("Plec");
        osoba.plec = sc.next().charAt(0);

        System.out.println("Dzial");
        osoba.dzial = sc.nextInt();
        System.out.println();

        return osoba;
    }

    void getPracownik() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Placa: " + placa);
        System.out.println("Plec: " + plec);
        System.out.println("Dzial: " + dzial);
        System.out.println();
    }
}
package oop.D009_14_07;

import java.io.*;

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
        if (LiczbaPracownikow != 0) {
            System.out.println("Lista pracownikow");
            System.out.println();

            for (int i = 0; i < LiczbaPracownikow; i++) {
                System.out.println("ID: " + i);
                pracownicy[i].getPracownik();
            }
        } else
            System.out.println("Brak pracownikow");
    }

    public void getPracownicyFirmy(int id) {
        if (id < LiczbaPracownikow && id >= 0)
            pracownicy[id].getPracownik();
        else
            System.out.println("Brak pracownika z takim nummerem ID");
    }

    public void setPracownikFirmy(Pracownik osoba) {
        pracownicy[LiczbaPracownikow] = osoba.setPracownik();
        LiczbaPracownikow++;
    }

    public void delPracownikFirmy(int id) {
        pracownicy[id] = null;
        LiczbaPracownikow--;
    }

    public double countAverageSalary() {
        //policzyc srednia pesje dla pracownikow
        int add = 0;

        for (int i = 0; i < LiczbaPracownikow; i++) {
            add += pracownicy[i].getPlaca();
        }
        return add / LiczbaPracownikow;
    }

    public double countAverageAge() {
        //policzyc sredni wiek
        int add = 0;

        for (int i = 0; i < LiczbaPracownikow; i++) {
            add += pracownicy[i].getWiek();
        }
        return add / LiczbaPracownikow;
    }

    public void getEmployeeWithHiestSalary() {
        //znaj pracownika z nawieksza wyplate
        double hiestSalary = pracownicy[0].getPlaca();
        int maxId = 0;

        for (int i = 0; i < LiczbaPracownikow; i++)
            if (pracownicy[i].getPlaca() > hiestSalary)
                maxId = i;

        System.out.println("Najwieksza pensja nalerzy do");
        System.out.println("Imie: "+pracownicy[maxId].getImie());
        System.out.println("Nazwisko: "+pracownicy[maxId].getNazwisko());
        System.out.println("Pensja: "+pracownicy[maxId].getPlaca());
    }

    public void zapis() throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("listaPracownikow.txt");
        zapis.println("Lista pracownika");
        zapis.println();
        for (int i = 0; i < LiczbaPracownikow; i++) {
            zapis.println("ID: " + i);
            zapis.println();
            zapis.println(pracownicy[i].getImie());
            zapis.println(pracownicy[i].getNazwisko());
            zapis.println(pracownicy[i].getWiek());
            zapis.println(pracownicy[i].getPlaca());
            zapis.println(pracownicy[i].getPlec());
            zapis.println(pracownicy[i].getDzial());
            zapis.println();
        }
        zapis.close();
    }

    public void odczyt() throws FileNotFoundException {
        FileReader fr = new FileReader("listaPracownikow.txt");
        String linia = "";

        BufferedReader bfr = new BufferedReader(fr);

        try {
            while((linia = bfr.readLine()) != null){
                System.out.println(linia);
            }
        }
        catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }
    }
}
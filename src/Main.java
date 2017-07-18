import oop.D009_14_07.Firma;
import oop.D009_14_07.Pracownik;

import java.util.Scanner;

/**
 * Created by Miver on 2017-07-13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Firma firma = new Firma();
        Pracownik pracownik = new Pracownik();
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu");
            System.out.println("1. Wyswietl pracownikow");
            System.out.println("2. Dodaj pracownika");
            System.out.println("3. Usun pracownika");
            System.out.println("4. Wyszukaj pracownika");
            System.out.println("0. Koniec");
            System.out.println();

            System.out.println("Co chcesz zrobic?");
            byte option = sc.nextByte();

            switch (option) {
                case 1:
                    firma.getPracownicyFirmy();
                    break;
                case 2:
                    firma.setPracownikFirmy(pracownik);
                    break;
                case 3:
                    System.out.println("Podaj ID pracownika");
                    firma.delPracownikFirmy(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Podaj ID pracownika");
                    firma.getPracownicyFirmy(sc.nextInt());
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Brak takiej opcji, sprobuj jeszcze raz.");
                    break;
            }
            System.out.println();
        }
    }
}

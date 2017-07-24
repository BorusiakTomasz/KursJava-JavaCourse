import oop.D012_19_07.specialTask.Figura;
import oop.D012_19_07.specialTask.Kolo;
import oop.D012_19_07.specialTask.Prostokat;
import oop.D012_19_07.specialTask.Trapez;

import java.util.Scanner;

/**
 * Created by Miver on 2017-07-13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura[] fig = new Figura[10];
        int liczbaFigur = 0;
        boolean exit = false;

        while(!exit) {
            System.out.println("Menu");
            System.out.println("0. Exit");
            System.out.println("1. Oblicz kolo");
            System.out.println("2. Oblicz prostokat");
            System.out.println("3. Oblicz trapez");
            System.out.println("4. Wypisz wyniki");
            System.out.println("5. Kasownia tablicy");
            System.out.println();

            System.out.println("Ktora figure chcesz obliczyc (max 10 figur)");
            byte x = sc.nextByte();
            System.out.println();

            if (liczbaFigur > 9) {
                System.out.println("Nie moge tego wykonac z powodu zapelnienia tablicy");
                x = 4;
            }

            switch (x) {
                case 0:
                    System.out.println("The end");
                    exit = true;
                    break;
                case 1:
                    System.out.println("KOLO");

                    System.out.println("Podaj promien");
                    double r = sc.nextDouble();

                    fig[liczbaFigur] = new Kolo(r);
                    System.out.println("Pole: "+fig[liczbaFigur].obliczPole());
                    System.out.println("Obwod: "+fig[liczbaFigur].obliczObwod());
                    liczbaFigur++;
                    System.out.println();
                    break;
                case 2:
                    System.out.println("PROSTOKAT");

                    System.out.println("Podaj A:");
                    double a = sc.nextDouble();
                    System.out.println("Podaj B:");
                    double b = sc.nextDouble();

                    fig[liczbaFigur] = new Prostokat(a, b);
                    System.out.println("Pole: "+fig[liczbaFigur].obliczPole());
                    System.out.println("Obwod: "+fig[liczbaFigur].obliczObwod());
                    liczbaFigur++;
                    System.out.println();
                    break;
                case 3:
                    System.out.println("TRAPEZ");

                    System.out.println("Podaj dlugosc dolnejPodstawy");
                    double dolnaPodstawa = sc.nextDouble();
                    System.out.println("Podaj dlugosc gornejPodstawy");
                    double gornaPodstawa = sc.nextDouble();
                    System.out.println("Podaj dlugosc lewegoBoku, badz bokow");
                    double lewyBok_boki = sc.nextDouble();
                    System.out.println("Podaj dlugosc prawegoBoku, badz wysokosc");
                    double prawyBok_wysokosc = sc.nextDouble();

                    fig[liczbaFigur] = new Trapez(dolnaPodstawa, gornaPodstawa, lewyBok_boki, prawyBok_wysokosc);
                    System.out.println("Pole: "+fig[liczbaFigur].obliczPole());
                    System.out.println("Obwod: "+fig[liczbaFigur].obliczObwod());
                    liczbaFigur++;
                    System.out.println();
                    break;
                case 4:
                    for(int i = 0; i < liczbaFigur; i++) {
                        fig[i].opisz();
                        System.out.println("Pole: "+fig[i].obliczPole());
                        System.out.println("Obwod: "+fig[i].obliczObwod());
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i < liczbaFigur; i++) {
                        fig[i] = null;
                    }
                    liczbaFigur = 0;

                    System.out.println("Tablica skasowana");
                    break;
                default:
                    System.out.println("Nie napisalem tego jeszcze");
                    break;
            }
        }
    }
}

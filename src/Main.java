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
        Figura[] fig = new Figura[3];
        boolean exit = false;

        while(!exit) {
            System.out.println("Menu");
            System.out.println("Oblicz kolo");
            System.out.println("Oblicz prostokat");
            System.out.println("Oblicz trapez");
            System.out.println();

            System.out.println("Ktory program chcesz uruchomic");
            byte x = sc.nextByte();
            System.out.println();

            switch (x) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    System.out.println("KOLO");

                    System.out.println("Podaj promien");
                    double r = sc.nextDouble();

                    fig[0] = new Kolo(r);
                    fig[0].obliczPole();
                    fig[0].obliczObwod();
                    break;
                case 2:
                    System.out.println("PROSTOKAT");

                    System.out.println("Podaj A:");
                    double a = sc.nextDouble();
                    System.out.println("Podaj B:");
                    double b = sc.nextDouble();

                    fig[1] = new Prostokat(a, b);
                    fig[1].obliczPole();
                    fig[1].obliczObwod();
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

                    fig[2] = new Trapez(dolnaPodstawa, gornaPodstawa, lewyBok_boki, prawyBok_wysokosc);
                    fig[2].obliczPole();
                    fig[2].obliczObwod();
                    break;
                default:
                    System.out.println("Nie napisalem tego jeszcze");
                    break;
            }
        }
    }
}

package objectOrientedPrograming.D016_25_07;

import java.util.Scanner;

/**
 * Created by Miver on 2017-07-13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KontoOszeczednosciowe mojeKonto = new KontoOszeczednosciowe(200);

        try {
            mojeKonto.wyplata(500);
        } catch (Exception e) {
            System.out.println("Wystapil blad: "+e.getMessage());
        }

        KontoOszeczednosciowe mojeMaleKonto = new MaleKonto(1000, 500);

        try {
            mojeMaleKonto.wyplata(300);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

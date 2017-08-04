package RandomProject.D019_02_08;

import java.util.Scanner;

/**
 * Created by Miver on 2017-08-02.
 */
public class CheckSerialNumberOfDocument {
    public static boolean checkSerialNumber(String n) {
        char[] litery = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] waga = new int[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
        int[] cyfry = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int suma = 0;
        for (int i = 0; i < 9; i++) {
            if (i < 3) {
                for (int j = 0; j < litery.length; j++) {
                    if (n.charAt(i) == litery[j]) {
                        if (i == 0)
                            suma += 7*waga[j];
                        if (i == 1)
                            suma += 3*waga[j];
                        if (i == 2)
                            suma += waga[j];
                    }
                }
            }
            if (i > 3) {
                for (int j = 0; j < cyfry.length; j++) {
                    int sprLiczba = n.charAt(i) - 48;
                    if (sprLiczba == cyfry[j]) {
                        if (i == 4 || i == 7)
                            suma += 7*cyfry[j];
                        if (i == 5 || i == 8)
                            suma += 3*cyfry[j];
                        if (i == 6)
                            suma += cyfry[j];
                    }
                }
            }
        }

        int wynik = suma % 10;
        int crc = n.charAt(3) - 48;

        return wynik == crc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj serial i numer dokumentu bez spacji");
        String SerialNumber = sc.nextLine();

        System.out.println(checkSerialNumber(SerialNumber) ? "Serial jest prawidlowy" : "Serial jest NIEprawidlowy");
    }
}

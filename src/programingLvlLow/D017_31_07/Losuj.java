package programingLvlLow.D017_31_07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * 1. Wczytywanie użytkowników z pliku do tablicy.
 * 2. Wylosowanie 1 użytkownika z puli nieoznaczonych.
 * 3. Wyświetlenie wylosowanego użytkownika
 * 4. Oznaczenie wylosowanego użytkownika
 * 5. Jeśli liczba użytkowników nieoznaczonych jest większa od 0 wróć do punktu 2
 */
public class Losuj {
    private static String[] usersList = new String[14];
    private static String[] usersRandomed = new String[15];
    private static int randomIndex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean doMore = true;

        try {
            usersList = AssignUsers();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        while(doMore) {
            System.out.println("Menu");
            System.out.println("0. Zamknij program");
            System.out.println("1. Wylosuj osobe");
            System.out.println("2. Wylosuj liste osob");
            System.out.println("3. Pokaz wszystkich wylosowanych");
            System.out.println("4. Nowe losowanie");
            System.out.println();

            System.out.println("Co wybierasz?");
            byte x = sc.nextByte();

            switch (x) {
                case 0:
                    System.out.println("Zamykam");
                    doMore = false;
                    break;
                case 1:
                    System.out.print("Zadanie idzie rozwiazac: ");
                    RandomUser();
                    System.out.println();
                    break;
                case 2:
                    for (int i = 0; i < usersRandomed.length-1; i++) {
                        RandomUser();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Lista osob, ktore probowaly:");
                    for (int i = 0; i < randomIndex; i++) System.out.println((i+1) + ". " + usersRandomed[i]);
                    System.out.println();
                    break;
                case 4:
                    for (int i = 0; i < usersRandomed.length; i++) usersRandomed[i] = null;
                    randomIndex = 0;
                    System.out.println("Zapamietane wyniki zostaly usuniete.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji.");
                    System.out.println();
                    break;
            }
        }
    }

    public static void RandomUser() {
        Random random = new Random();

        boolean doMore = true;
        boolean other = true;

        while (doMore && other) {
            int randomNumber = random.nextInt(14);

            for (int i = 0; i < usersRandomed.length; i++) {
                if (usersList[randomNumber].equals(usersRandomed[i])) {
                    if (randomIndex == usersRandomed.length-1) {
                        System.out.println("Nikt, bo wszyscy juz byli. Proponuje rozpoczac od nowa.");
                        other = false;
                    }
                    break;
                } else if (usersRandomed[i] == null) {
                    System.out.println((randomIndex+1) + ". " + usersList[randomNumber]);

                    usersRandomed[randomIndex] = usersList[randomNumber];
                    randomIndex++;
                    doMore = false;
                    break;
                }

            }
        }
    }

    public static String[] AssignUsers() throws IOException {
        String[] usersArray = new String[14];
        FileReader file = new FileReader("/src/RandomProject/D017_31_07/users.txt");
        BufferedReader buffer = new BufferedReader(file);

        String lines;
        int i = 0;
        while ((lines = buffer.readLine()) != null) {
            usersArray[i] = lines;
            i++;
        }
        file.close();

        return usersArray;
    }
}

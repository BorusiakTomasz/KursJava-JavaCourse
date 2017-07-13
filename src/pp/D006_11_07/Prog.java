package pp.D006_11_07;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Miver on 2017-07-11.
 */
public class Prog {
    public static void printMessage(String imie) {
        System.out.println();
        System.out.println("Witaj " + imie);
    }

    public static void describeUser(String name, String surName, int age) {
        System.out.println(name + " " + surName + " " + age);
    }

    public static void printArray(int[] array) {
        for (int i : array)
            if (i == 10)
                System.out.println(i);
            else
                System.out.print(i + ", ");

    }

    public static int addElements(int a, int b) {
        return a + b;
    }

    public static int factorial(int n) {
        int resoult = 1;
        for (int i = 0; i < n; i++)
            resoult *= i;
        return resoult;
    }

    public static float avrange(float[] arr) {
        float suma = 0;
        for (float i : arr)
            suma += i;
        return suma / arr.length;
    }

    public static void initializeArray(float[] array) {
        Random rand = new Random();
        array = new float[5]; //tworze nowy obszar pamieci dla tej inicjalizacji, wiec stara inicjalizacja zostanie,
        //a pracuje na nowej.
        //Gdyby tego nie bylo, tablica zostalaby zainicjalizowala referencyjnie.

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50);
        }
        System.out.println("Array initialized");
        //Return nie jest konieczny przez referencyjnosc parametru funkcji
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Funkcja powitalna");
        System.out.println("2. Wyswietlenie wielu danych za pomoca funkcji");
        System.out.println("3. Wydrukuj tablice");
        System.out.println("4. Dodaj dwie liczby do siebie");
        System.out.println("5. Oblicz silnie");
        System.out.println("6. Oblicz srednia");
        System.out.println("7. Wyswietl elementy tablicy - przyklad trenera, opis w funckcji");
        System.out.println();

        System.out.println("Podaj nr programu");
        int x = sc.nextInt();
        System.out.println();

        switch (x) {
            case 1:
                System.out.println("Podaj imie");
                printMessage(sc.nextLine());
                break;
            case 2:
                describeUser("Jan", "Kowalski", 30);
                System.out.println();
                break;
            case 3:
                int[] tabInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                printArray(tabInt);
                break;
            case 4:
                System.out.println(addElements(5, 15));
                break;
            case 5:
                System.out.println("Oblicz silnie z");
                System.out.println(factorial(sc.nextInt()));
                break;
            case 6:
                float[] tabFloat = new float[]{1.5f, 2.5f, 3.5f, 4.5f};
                avrange(tabFloat);
                break;
            case 7:
                float[] array = new float[]{1,2,3,4,5};

                initializeArray(array);
                for(float f: array){
                    System.out.println(f);
                }
                break;
            default:
                System.out.println("Nie napisalem jeszcze takiego programu");
                break;
        }
    }
}

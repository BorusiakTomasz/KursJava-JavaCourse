import java.util.Scanner;

/**
 * Created by Miver on 2017-07-13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[] {1, 2, 3, 4, 5};

        System.out.println("Podaj element ktory chcesz wyswietlic");
        int numer = sc.nextInt();

        try {
            System.out.println(arr[numer]);
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("Nie ma elementu tablicy o indexie: "+ex.getMessage());
            System.out.println("Nie ma takiego indexu w tablicy, tablica posiada tylko: "+arr.length+" elementow");
        }
    }
}

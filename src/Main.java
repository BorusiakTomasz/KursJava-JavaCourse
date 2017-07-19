import java.util.Scanner;

/**
 * Created by Miver on 2017-07-13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("Menu");
            System.out.println("1. ");
            System.out.println();

            System.out.println("Co chcesz zrobic?");
            byte option = sc.nextByte();

            switch (option) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    break;
                default:
                    System.out.println("Brak takiej opcji, sprobuj jeszcze raz.");
                    break;
            }
            System.out.println();
        }
    }
}

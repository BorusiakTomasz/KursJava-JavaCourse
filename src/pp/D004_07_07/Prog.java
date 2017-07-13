package pp.D004_07_07;
import java.util.Scanner;

/**
 * Created by Miver on 2017-07-07.
 */
public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String napis;
        while(true) {
            System.out.println("Podaj cos");
            napis = sc.nextLine();

            if (napis.length() >= 30) {
                System.out.println("Zbyt dlugi ciag znakow");
            }
            else break;
        }
        System.out.println();

        System.out.println("Menu");
        System.out.println("1. Zmienmale litery na male");
        System.out.println("2. Zmien litery na duze");
        System.out.println("3. Zmien male na duze i na odwrot");
        System.out.println("4. Wyswietl napis od konca");
        System.out.println("5. Czy jest palindromem");
        System.out.println("6. Jaka ma ilosc znakow (parzysty/nieparzysty)");
        System.out.println();

        System.out.println("Co wybierasz:");
        byte x = sc.nextByte();
        System.out.println();

        switch(x) {
            case 1:
                System.out.println(napis.toLowerCase());
                break;
            case 2:
                System.out.println(napis.toUpperCase());
                break;
            case 3:
                String wynik = "";
                for(int i = 0; i < napis.length(); i++) {
                    char znak = napis.charAt(i);
                    //male litery
                    if(znak >= 97 && znak <= 122) {
                        znak -= 32;
                    }
                    //duze litery
                    else if(znak >= 65 && znak <= 90) {
                        znak += 32;
                    }
                    wynik += znak;
                }
                System.out.println(wynik);
                break;
            case 4:
                wynik = "";
                for(int i = (napis.length()-1); i >= 0; i--) {
                    char znak = napis.charAt(i);
                    wynik += znak;
                }
                System.out.println(wynik);
                break;
            case 5:
                //czy jest palindromem
                char nap = (char) (napis.length() - 1);
                for(int i = 0; i < nap; i++) {
                    char z1 = napis.charAt(i);
                    char z2 = napis.charAt(nap - i);
                    if(z1 != z2) {
                        System.out.println("Ciag nie jest palindromem");
                        break;
                    }
                    else if(i == (napis.length()-2)) {
                        System.out.println("Ciag jest palindromem");
                    }
                }
                break;
            case 6:
                //Jaka ma ilosc znakow (parzysty/nieparzysty)
                int licznik = 0;
                for(int i = 0; i < napis.length(); i++) {
                    licznik++;
                }
                if(licznik % 2 == 0) System.out.println("Ciag parzysty");
                else System.out.println("Ciag nieparzysty");
                break;
        }
    }
}

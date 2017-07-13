package pp.D003_06_07;
import java.util.Scanner;

/**
 * Created by Miver on 2017-07-06.
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Kalkulator");
        System.out.println("2. pre i post inkrementacja");
        System.out.println("3. Proste petle");
        System.out.println("4. Zadanie 1: wypisz liczby 0..100");
        System.out.println("5. Zadanie 2: liczby podzielne przez 7 z 1..500");
        System.out.println("6. Zadanie 3: dlugosc lancucha znakowego");
        System.out.println();

        System.out.println("Podaj numer programu");
        byte z = sc.nextByte();

        switch(z) {
            case 1:
                double wynik = 0;
                while (true) {
                    System.out.println("Podaj pierwsza liczbe");
                    double a = sc.nextDouble();

                    System.out.println("Podaj znak: +, -, *, /");
                    char x = sc.next().charAt(0);

                    System.out.println("Podaj druga liczbe");
                    double b = sc.nextDouble();


                    switch (x) {
                        case '+':
                            wynik = a + b;
                            break;
                        case '-':
                            wynik = a - b;
                            break;
                        case '*':
                            wynik = a * b;
                            break;
                        case '/':
                            wynik = a / b;
                            break;
                        default:
                            System.out.println("Kalkulator nie posiada takiego dzialania, sproboj ponownie");
                            break;
                    }
                    if (x == '+' || x == '-' || x == '*' || x == '/') break;
                }
                System.out.println("Wynik: " + wynik);
                break;
            case 2:
                int licznik = 0;
                while(licznik <= 10) {
                    System.out.println(licznik++);
                }
                while(licznik < 10) {
                    System.out.println(++licznik);
                }
                break;
            case 3:
                for(int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
                for(int i = 10; i >= 0; i--) {
                    System.out.println(i);
                }
                break;
            case 4:
                for(int i = 0; i < 100; ++i) {
                    System.out.println(i);
                }
                int l = 0;
                while(l < 100) {
                    System.out.println(++l);
                }
                break;
            case 5:
                for(int i = 1; i <= 500; i++) {
                    if (i%7 == 0) System.out.println("Podzielna przez 7: "+i);
                }
                break;
            case 6:
                System.out.println("Podaj lancuch znakow");
                String napis = sc.nextLine();

                //z bialymi znakami
                for(int i = 0; i < napis.length(); i++) {
                    //maly niewypal prowadzacego
                }
                System.out.println("dlugosc napisu: "+napis.length());

                //bez bialych znakow
                int li = 0;
                for(int i = 0; i < napis.length(); i++) {
                    char znak = napis.charAt(i);
                    if(znak != ' ') {
                        li++;
                    }
                }
                System.out.println(li);
                break;
            default:
                break;
        }
    }
}

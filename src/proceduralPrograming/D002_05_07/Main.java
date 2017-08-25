package proceduralPrograming.D002_05_07;
import java.util.Scanner;

/**
 * Created by Miver on 2017-07-05.
 *
 * Notatki:
 * -brak na zajeciach instrukcji switch, for
 *  zaczynamy dopiero if, YEAH.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Converter");
        System.out.println("2. min/max");
        System.out.println("3. BMI");
        System.out.println("4. Kalkulator");
        System.out.println();

        System.out.println("Jaki program chcesz uruchomic: ");
        byte x = sc.nextByte();
        System.out.println();

        switch(x) {
            case 1:
                System.out.println("Podaj temperature w stopniach Celsjusza: ");
                double stopnie_Celsjusza = sc.nextDouble();

                double stopnie_Farenheita = 1.8 * stopnie_Celsjusza + 32.0;

                System.out.println("W Farenheitach wynosi ona: "+stopnie_Farenheita);
                break;
            case 2:
                //sposob 1
                /*int[] tab = new int[3];
                int min = 0, max = 0;

                System.out.println("Podaj 3 liczby");
                for (int i = 0; i<3; i++) {
                    System.out.println("Podaj "+(i+1)+" liczbe: ");
                    tab[i] = sc.nextInt();

                    if (i==0) min = tab[i];
                    if (i==0) max = tab[i];

                    if (tab[i]<min) min = tab[i];
                    if (tab[i]>max) max = tab[i];
                }

                System.out.println("Min: "+min);
                System.out.println("Max: "+max);*/

                System.out.println("Podaj pierwsza liczbe");
                int a = sc.nextInt();

                System.out.println("Podaj druga liczbe");
                int b = sc.nextInt();

                System.out.println("Podaj trzecia liczbe");
                int c = sc.nextInt();

                String output = String.format("%d %d %d", a, b, c);
                System.out.println(output);

                //sposob 2
                /*if (a<b && a<c) System.out.println("Najmniejsza: "+a);
                else if (b<c) System.out.println("Najmniejsza: "+b);
                else System.out.println("Najmniejsza: "+c);

                if (a>b && a>c) System.out.println("Najwieksza: "+a);
                else if (b>c) System.out.println("Najwieksza: "+b);
                else System.out.println("Najwieksza: "+c);*/

                //sposob 3: dziel i zwyciezaj
                int max;

                if (a > b) max = a;
                else max = b;

                if (c > max) max = c;

                System.out.println("Najwieksza to "+max);
                break;
            case 3:
                System.out.println("Podaj swoja wage");
                float waga = sc.nextFloat();
                System.out.println("Podaj swoj wzrost w metrach");
                float wzrost = sc.nextFloat();

                float bmi = waga / (wzrost*wzrost);

                if (bmi < 18.5) System.out.println("Masz niedowage");
                else if (bmi > 25) System.out.println("Masz nadwage");
                else System.out.println("Waga ok");
                break;
            case 4:
                System.out.println("Podaj pierwsza liczbe");
                int l1 = sc.nextInt();

                System.out.println("Podaj operacje(+, -, *, /)");
                String op = sc.next();

                System.out.println("Podaj pierwsza liczbe");
                int l2 = sc.nextInt();

                int wynik;
                switch(op) {
                    case "+":
                        wynik = l1+l2;
                        break;
                    case "-":
                        wynik = l1-l2;
                        break;
                    case "*":
                        wynik = l1*l2;
                        break;
                    case "/":
                        wynik = l1/l2;
                        break;
                    default:
                        wynik = 0;
                        break;
                }
                System.out.println("Wynik: "+wynik);
                break;
            default:
                System.out.println("Nie mam takiego programu, operatorze.");
                break;
        }
    }
}

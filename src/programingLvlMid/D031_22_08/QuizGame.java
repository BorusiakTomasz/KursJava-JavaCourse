package programingLvlMid.D031_22_08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Miver on 2017-08-22.
 */
public class QuizGame {
    private static final String PATH_TO_RESOULTS = "src/RandomProject/D031_22_08/wyniki.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Menu");
            System.out.println("0. Wyjscie");
            System.out.println("1. Nowy quiz");
            System.out.println("2. Pokaz wyniki");
            byte x = sc.nextByte();
            System.out.println();

            switch (x) {
                case 0: //to juz jest koniec
                    flag = false;
                    break;
                case 1: //nowy quiz
                    Quiz quiz = new Quiz();
                    List<Question> questions = quiz.readAllQuestions();

                    System.out.println("Podaj nazwe uzytkownika");
                    String userName = sc.next();
                    System.out.println();

                    //wczytaj numer pytania
                    //wczytaj odpowiedz od uzytkownika
                    //sprawdzic czy wczytana odpowiedz jest prawidlowa
                    //zwiekszyc licznik prawidlowych odpowiedzi
                    //podac wynik(czy dobra odpowiedz czy nie)

                    int punkty = 0;
                    for (int i = 0; i < questions.size(); i++) {
                        System.out.println("Pytanie nr " + i + "/" + questions.size());
                        System.out.println(questions.get(i).getTitle());
                        for (String q : questions.get(i).getAnswers())
                            System.out.println(q);
                        String odp = sc.next();
                        if (questions.get(i).getCorrectAnswer().equals(odp)) {
                            System.out.println("Prawidlowa odpowiedz");
                            punkty++;
                        } else
                            System.out.println("Bledna odpowiedz");
                        System.out.println();
                    }

                    System.out.println("Zdobylas/es: " + punkty + "/" + questions.size());
                    String wynik = userName + " " + punkty + "\n";
                    System.out.println("Zapisuje do pliku");
                    try {
                        Path p = Paths.get(PATH_TO_RESOULTS);
                        Files.write(p, wynik.getBytes(), Files.exists(p) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2: //pokaz wyniki
                    System.out.println("Wyniki");
                    List<String> ranking = Quiz.getRanking();
                    if (ranking != null)
                        for (String w : ranking)
                            System.out.println(w);
                    else
                        System.out.println("Brak wynikow");
                    break;
                default:
                    System.out.println("Brak takowej funkcjonalnosci");
            }
            System.out.println();
        }
    }
}

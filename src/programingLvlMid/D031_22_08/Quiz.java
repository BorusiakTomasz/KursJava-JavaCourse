package programingLvlMid.D031_22_08;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miver on 2017-08-22.
 */
public class Quiz {
    private static final String PATH_TO_RESULTS = "src/RandomProject/D031_22_08/wyniki.txt";
    private static final String PATH_TO_QUESTIONS = "src/RandomProject/D031_22_08/pytania.txt";

    public static List<String> getRanking() {
        /**
         * odczytaj z pliku "wyniki.txt" - done
         * zwroc te wyniki - done
         */
        List<String> rank = null;

        try {
            rank = Files.readAllLines(Paths.get(PATH_TO_RESULTS));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rank;
    }

    public List<Question> readAllQuestions() {
        /**
         * 1. Odczytac wszystkie linie - done
         * 2. Zmapowac pytania na obiekty typu Question - done
         */

        List<Question> questionList = new ArrayList<>();
        List<String> questionFromFile = null;

        try {
            questionFromFile = Files.readAllLines(Paths.get(PATH_TO_QUESTIONS));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < questionFromFile.size(); i += 6) {
            Question question = new Question();
            question.setTitle(questionFromFile.get(i));
            question.getAnswers().add(questionFromFile.get(i + 1));
            question.getAnswers().add(questionFromFile.get(i + 2));
            question.getAnswers().add(questionFromFile.get(i + 3));
            question.getAnswers().add(questionFromFile.get(i + 4));
            question.setCorrectAnswer(questionFromFile.get(i + 5));
            questionList.add(question);
        }

        return questionList;
    }
}

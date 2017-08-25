package programingLvlMid.D031_22_08;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miver on 2017-08-22.
 */
public class Question {
    private String title;
    private List<String> answers = new ArrayList<>();
    private String correctAnswer;

    public Question() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}

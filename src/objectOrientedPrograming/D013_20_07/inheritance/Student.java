package objectOrientedPrograming.D013_20_07.inheritance;

/**
 * Created by Miver on 2017-07-20.
 */
public class Student extends Person {
    private int index;
    private String kierunek;
    private String uczelnia;

    Student() {

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public String getUczelnia() {
        return uczelnia;
    }

    public void setUczelnia(String uczelnia) {
        this.uczelnia = uczelnia;
    }
}

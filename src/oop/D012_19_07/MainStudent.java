package oop.D012_19_07;

/**
 * Created by Miver on 2017-07-19.
 */
public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.printStudent();

        Student studentInformatyki = new Student("Jan", "Kowalski", 50, 1234567, 2017);
        studentInformatyki.printStudent();
    }
}

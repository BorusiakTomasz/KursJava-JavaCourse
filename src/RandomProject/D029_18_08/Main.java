package RandomProject.D029_18_08;

import java.util.List;

/**
 * Created by Miver on 2017-08-18.
 */
public class Main {
    private static final String PATH_TO_FILE = "D:\\KursJava\\src\\RandomProject\\D029_18_08\\plik.txt";

    public static void main(String[] args) throws InterruptedException {
        List<String> x = FileOperations.readAllLines(PATH_TO_FILE);
        System.out.println(x.toString());
    }
}

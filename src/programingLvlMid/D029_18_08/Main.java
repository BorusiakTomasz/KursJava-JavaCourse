package programingLvlMid.D029_18_08;

import java.util.List;

/**
 * Created by Miver on 2017-08-18.
 */
public class Main {
    private static final String PATH_TO_FILE = "D:\\KursJava\\src\\RandomProject\\D029_18_08\\plik.txt";

    public static void main(String[] args) throws InterruptedException {
        /*String plik = FileOperations.readFile(PATH_TO_FILE);
        System.out.println(plik);*/

        /*String calyPlik = FileOperations.readFileWithStringBuilder(PATH_TO_FILE);
        System.out.println(calyPlik);*/

        List<String> lista = FileOperations.readAllLines(PATH_TO_FILE);
        for (String s : lista)
            System.out.println(s);
    }
}

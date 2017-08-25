package programingLvlMid.D029_18_08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Miver on 2017-08-18.
 */
public class FileOperations {
    public static String readFile(String path) throws InterruptedException {
        BufferedReader bufferedReader = null;
        String result = "";
        String line;

        try {
            bufferedReader = new BufferedReader(new FileReader(path));

            while ((line = bufferedReader.readLine()) != null) {
                result += line;
                Thread.sleep(100);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }

    public static String readFileWithStringBuilder(String path) throws InterruptedException {
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        String line;

        try {
            bufferedReader = new BufferedReader(new FileReader(path));

            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line+"\n");
                Thread.sleep(100);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return stringBuilder.toString();
    }

    public static List<String> readAllLines(String path) {
        List<String> lista = null;

        try {
            lista = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lista;
    }
}

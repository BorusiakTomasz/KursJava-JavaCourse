package programingLvlMid.D030_21_08;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Miver on 2017-08-21.
 */
public class FileOverview {
    public static void main(String[] args) {
        try {
            createDirectoryAndFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        private static final String PATH_TO_FILE ="C:\\Users\\RENT\\IdeaProjects\\hello\\src\\plik.txt";

        public static void main(String[] args) throws InterruptedException, IOException {

            System.out.println("zaczynam czytac");
            String line = null;
            int nr_linii = 0;
            try(BufferedReader reader = new BufferedReader(new FileReader("plik.txt"))){

                while ((line = reader.readLine())!= null){
                    System.out.println(++nr_linii + ": " + line);

                }
            }
            catch (IOException ex){
                ex.printStackTrace();
            }

        }
         */
    }

    public static void createDirectoryAndFile() throws IOException {
        Scanner sc = new Scanner(System.in);

        // 1. Zapytac o nazwe katalogu
        System.out.println("Podaj nazwe katalogu - src/RandomProject/D030_21_08/");
        String directoryName = sc.nextLine();

        makeDirectory(directoryName);


        // 2. Stworzenie katalogu o podanej nazwie


        // 3. Zapytac o notatke
        System.out.println("Podaj notatke");
        String note = sc.nextLine();

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(directoryName);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(note);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null)
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (fileWriter != null)
                try {
                    fileWriter.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
        }


        // 4. Dopisac date i zapisac notatke w pliku o nazwie notatka.txt

    }

    private static void makeDirectory(String directoryName) throws IOException {
        File file = new File(directoryName);

        if (file.exists())
            System.out.println("Katalog istnieje");
        else
            System.out.println(file.createNewFile() ? "Utworzono katalog" : "Nie udalo sie utworzyc katalogu");
    }

    public static void createFileWithResorces(String path) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj notatke");
        String note = sc.nextLine();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write(note);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createNote() {
        getDirectoryName();
    }

    private static String getDirectoryName() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj nazwe katalogu - src/RandomProject/D030_21_08/");
        String directoryName = sc.nextLine();

        File file = new File(directoryName);

        if (file.exists())
            System.out.println("Katalog istnieje");
        else
            System.out.println("Utworzono katalog");

        return directoryName;
    }
}

/*
public static String readFile(String path) throws InterruptedException {

        BufferedReader bufferedReader = null;
        String result = null;
        String line = null;
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
        StringBuilder stringBuilder = new StringBuilder(); //////////////// ZMIANA
        String line = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);  //////////////// ZMIANA
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


        return stringBuilder.toString();   //////////////// ZMIANA
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
 */

/*
    //publiczna metoda wykonujaca utworzenie katalogu
    //utworzenie pliku
    //zapis do pliku
    public static void createDirectoryAndFile() throws IOException {
        String directoryName = getDirectoryName();
        makeDirectory(directoryName);
        saveNoteToFile(directoryName, getNote());
    }

    //pomocnicza metoda, tworzaca katalog
    private static String getDirectoryName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe katalogu");
        String directoryName = scanner.nextLine();
        return directoryName;
    }

    private static String getNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj notatke");
        String note = scanner.nextLine();
        return note;
    }

    private static void saveNoteToFile(String directoryName, String note) {
        Scanner sc = new Scanner(System.in);
        boolean append = false;
        File myFile = new File(directoryName);
        if(myFile.exists()){
            System.out.println("Plik istnieje. Czy chcesz do niego dopisac? Wpisz true lub false");
            append = sc.nextBoolean();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(directoryName + "\\plik.txt", append))) {
            bufferedWriter.write(note);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void makeDirectory(String directoryName) throws IOException {
        File file = new File(directoryName);

        if (file.exists()) {
            System.out.println("Katalog istnieje");
        } else {

            //Metoda mkdir - tworzy nowy katalog i zwraca wynik tej operacji-> true jesli sie udalo, false w przeciwnym przypadku
            if (file.mkdir()) {
                System.out.println("Utworzono katalog");
            } else {
                System.out.println("Nie udalo sie utworzyc katalogu");
            }
            // To samo z uzyciem operatora trojargumentowego
            //            System.out.println(file.mkdir() ? "Utworzono katalog" : "Nie udalo sie");

        }
}
 */
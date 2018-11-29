package at.htl.exam01.compress;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";


    /**
     * Main-Methode, hier wird das StringCompress-Objekt erstellt
     * und die Methoden des Objekts werden aufgerufen
     *
     * @param args
     */

    public static void main(String[] args) {
        StringCompress sc = new StringCompress();
        String[] text = sc.readFromFile(FILE_NAME);
        sc.print(text);




    }


    /**
     *
     * Sämtliche Zeilen werden aus der Textdatei eingelesen
     * zB A5
     * Nun wird in das String-Array AAAAA geschrieben
     *
     * Bsp Testdatei
     * A5
     * B3
     * C4
     *
     * ergibt eine String-Array mit 3 Elementen
     * AAAAA
     * BBB
     * CCCC
     *
     * @param fileName
     * @return String-Array mit dem entpacktem Text
     */
    public static String[] readFromFile(String fileName) {
        String[] text = new String[getNoOfLines(FILE_NAME)];
        int i = 0;
        try(Scanner scanner = new Scanner(new FileReader(FILE_NAME))){
            while(scanner.hasNextLine()){
                text[i] = scanner.nextLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return text;
    }


    /**
     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
     *
     *
     * @param lines String-Array
     */
    public static void print(String[] lines) {

        for (int i = 0; i < lines.length; i++) {
            String stringzahl = lines[i].substring(1);
            String buchstabe = lines[i].substring(0,1);

            int zahl = Integer.parseInt(stringzahl);
            for (int j = 0; j < zahl; j++) {
                System.out.print(buchstabe);
            }
            buchstabe = "";
            System.out.println();
        }
    }

    /**
     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     *
     * @param fileName
     * @return Anzahl der Zeilen in der Textdatei
     */
    public static int getNoOfLines(String fileName) {
        int counter = 0;
        try(Scanner scanner = new Scanner(new FileReader(FILE_NAME))) {
            while(scanner.hasNextLine()){
                counter++;
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return counter;
    }

}


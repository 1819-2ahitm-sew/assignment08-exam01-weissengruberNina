package at.htl.exam01.document;

import java.util.Scanner;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Document[] document = new Document[1000];
        String[] liste = new String[1000];



        System.out.println("1: Buch");
        System.out.println("2: Email");
        System.out.println("3: Ausgabe");
        System.out.println("4: Ende");

        int eingabe = scanner.nextInt();

        do{
            switch (eingabe){
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    return;
                case 2:
                    System.out.println("Subjekt: ");
                    String subjekt = scanner.nextLine();
                    System.out.println("To: ");
                    String to = scanner.nextLine();
                    return;
                case 3:

                    return;
                case 4:
                    return;
            }
        }
        while (eingabe != 4);


    }



    class Document{

    }


}

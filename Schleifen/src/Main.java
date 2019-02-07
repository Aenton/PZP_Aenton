import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner einbinden
        // Zwei Zahlen einlesen und als laenge und breite abspeichern

        Scanner derScanner = new Scanner(System.in);
        System.out.print("Geben Sie die Länge ein: ");
        int laenge = derScanner.nextInt();
        System.out.print("Geben Sie die Breite ein: ");
        int breite = derScanner.nextInt();
        System.out.println();
        // Ternärer Operator
        System.out.println("Die Breite liegt bei " + breite + ((breite == 1) ? " Feld" : " Feldern"));
        /*System.out.print(breite);
        if(breite == 1) {
            System.out.println(" Feld.");
        }
        else {
            System.out.println(" Feldern.");
        }*/


        // Schleifen - For Schleife
        // Schleifenkopf:   1. Teil:    Zählvariable und Startwert
        //                  2. Teil:    Grenze (Möglich sind hier alle Operatoren)
        //                              <, <=, >, >=, ==, !=
        //                  3. Teil:    Anweisung nach einem Durchlauf
        //                              i++: Erhöhe um eines
        //                              i--: Erniedrige um eins

        // Gefülltes Rechteck
        for(int i = 1; i <= laenge; i++) {
            for(int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Geben Sie die Rahmenstärke an: ");
        int rahmen = derScanner.nextInt();
        // Ungefülltes Rechteck
        // Erste Zeile
        for(int i = 1; i <= rahmen; i++) {
            for (int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        // 2. - vorletzte Zeile
        for(int i = 1; i <= laenge - rahmen * 2; i++) {
            // Rahmen Teil 1 - Teil vor der Aussparung
            for(int k = 1; k <= rahmen; k++) {
                System.out.print("#");
            }
            // Aussparung
            for(int j = 1; j <= breite - 2*rahmen; j++) {
                System.out.print(" ");
            }
            // Rahemen Teil 2 - Teil nach der Aussparung
            for(int k = 1; k <= rahmen; k++) {
                System.out.print("#");
            }
            // Zeilenumbruch am Ende der Zeile
            System.out.println();
        }
        // Letzte Zeile
        for(int i = 1; i <= rahmen; i++) {
            for (int j = 1; j <= breite; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();

    }
}

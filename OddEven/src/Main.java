import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner Waskommt = new Scanner(System.in);

                // Anfangswert der WhileSchleife setzen,um mit dem "ja" die erste Eingabe zu erwarten.

        String Nochmal = "ja";

        while ( Nochmal.equals("ja")) {

                //ab hier übergeordnete WhileSchleife - solange gilt : "Nochmal=ja" wird weiter abgefragt.

            System.out.println("Gib eine Zahl unter 100 Mio. ein!: ");

            int Zahl = Waskommt.nextInt();

                // Das hier drunter ist die Modulo.Rechnung - "((Variable % x)== Restwert y)".

            if ((Zahl % 2) == 1) {

                System.out.println("Das ist eine ungerade Zahl!");
            }
            else {

                System.out.println("Das ist eine gerade Zahl!");
            }

            System.out.println("Willst Du nochmal?");
            System.out.println(" ");
            System.out.println("Ja oder nein - jede andere Eingabe");
            System.out.println("führt zur Wiederholung der Aufforderung!");
            Nochmal = Waskommt.next();
                     /*
                    hier reagiert die nun folgende WhileSchleife darauf,ob nun "ja","nein" oder sonstwas kommt...
                    --solange ´Nochmal´ nicht "ja" UND nicht "nein" ist wird erneut nachgefragt.
                     */

                     while (!Nochmal.equals("nein") && !Nochmal.equals("ja")) {
                    System.out.println("Willst Du nochmal? JA oder NEIN steht doch da");
                    System.out.println("ganz deutlich,sonst wird die Aufforderung wiederholt");
                    Nochmal = Waskommt.next();
                }

        }
    }
}

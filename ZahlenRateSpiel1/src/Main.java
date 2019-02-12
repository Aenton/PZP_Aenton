import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Das ZahlenRateSpiel1!");

        Scanner Eingabe = new Scanner(System.in);

        System.out.println("Ich denke an eine Zahl zwischen 1 und 1000 - kannst Du sie erraten?\nDu hast max. 10 Versuche.\nNach jeder Eingabe bekommst Du eine Mitteilung,");

        System.out.println("ob Du beim nächsten mal höher oder tiefer raten musst...und los!");

        System.out.println("****************************************************************");

        String Nochmal = "ja";

        while (Nochmal.equals("ja")) {

            System.out.println("Eine Zahl von 1-1000: ");

            Random Zufall = new Random();

            int ZZ = 1 + Zufall.nextInt(1000);

            //System.out.println(ZZ);

            int Geraten = Eingabe.nextInt();

            int Versuche = 1;

            while (ZZ != Geraten && Versuche < 10) {

                //if (Versuche >9)

                if (Geraten < ZZ) {
                    System.out.println("Du musst höher!");
                } else {
                    System.out.println("Du musst tiefer");
                }

                Geraten = Eingabe.nextInt();

                Versuche++;
            }

            if (ZZ == Geraten) {
                System.out.println("Verdammt, ja, es war die" + ZZ + "- willst du nochmal?");
            } else {
                System.out.println("Ällabätsch, es war die" + ZZ + "- willst Du es nochmal versuchen?");
            }


            System.out.println(" ");
            System.out.println("Ja oder nein - jede andere Eingabe");
            System.out.println("führt zur Wiederholung der Aufforderung!");
            Nochmal = Eingabe.next();
                     /*
                    hier reagiert die nun folgende WhileSchleife darauf,ob nun "ja","nein" oder sonstwas kommt...
                    --solange ´Nochmal´ nicht "ja" UND nicht "nein" ist wird erneut nachgefragt.
                     */


            while (!Nochmal.equals("nein") && !Nochmal.equals("ja")) {
                System.out.println("Willst Du nochmal? JA oder NEIN steht doch da");
                System.out.println("ganz deutlich,sonst wird die Aufforderung wiederholt");
                Nochmal = Eingabe.next();

            }
        }
    }
}

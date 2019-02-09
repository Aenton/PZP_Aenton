import java.util.Scanner;

public class RechteckZahl {
    //Nachmittag mit SK
    public static void main(String[] args) {
                                        /*Hier unterhalb beginnt eine vorgesetzte "for"-Schleife (nachträglich zur Wiederholung des Folgenden angefügt.
                                        um das,was für die Breite angewiessen wurde in der Höhe zu wiederholen - der Zeilenumbruch wird
                                        aber erst zum Schluss festgelegt).
                                         */
        Scanner Eingabe = new Scanner(System.in); // Erzeugung des Scanner Objekts

        System.out.print("Sag wie breit: ");

        int breite = Eingabe.nextInt();

        System.out.print("Sag wie hoch: ");

        int hoehe = Eingabe.nextInt();
            //System.out.println("Gefuellt  =1 oder leer = 0?");
            // int fuellung = Eingabe.nextInt();
            //System.out.println();
            //String fuellzeichen = "";
                                    //HIER darueber musste dem BEZEICHNER "fuellzeichen" ein Standardwert gegeben werden,falls etwas anderes als 0 oder 1 auftritt!!!
        int fuellzahl = 1;


            //Zeilen hochzählen

        for (int h = 0; h < hoehe ; h++) {

            //Reihen ausgeben

            for (int b = 0; b < breite ; b++) {
                System.out.print( fuellzahl );

            }
            //Zeilenumbruch nach ausgabe einer Reihe

            System.out.print("\n");
            fuellzahl++;
            if ( fuellzahl > 9 ) {
                fuellzahl = 0;
            }
        }
    }
}

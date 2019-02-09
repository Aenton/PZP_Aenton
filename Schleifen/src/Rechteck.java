import java.util.Scanner;

public class Rechteck {
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
        System.out.println("Gefuellt  =1 oder leer = 0?");
        int fuellung = Eingabe.nextInt();
        System.out.println();
        String fuellzeichen = "";
                                    //HIER darueber musste dem BEZEICHNER "fuellzeichen" ein Standardwert gegeben werden,falls etwas anderes als 0 oder 1 auftritt!!!
        if(fuellung == 1){
            fuellzeichen = "#";
        }
        else if(fuellung == 0){
            fuellzeichen = " ";

        }
        else if(fuellung ==2)    {
            int fuellzahl = 1;

        }else{
            fuellzeichen = "*";
        }

                                    //Breite 1. Zeile folgt:
        for (int b = 0; b < breite; b++) {
            System.out.print("#");
        }
        System.out.println();
                                        //Höhe 2. bis vorletzte zeile
        for (int h = 0; h < hoehe -2; h++) {
                                        /*Die untere Schleife besagt:"wiederhole das in sOutPt Erwähnte von Pos 0 bis n-2-erste und letzte Zeile ausgespart.

                                        //erstes Zeichen der Zeile                             */
            System.out.print("#");
                                         //innere Zeichen
            for (int b = 0; b < breite -2; b++) {

               /* ist fuellung = 1
                        mache das
                System.out.print(fuellzeichen);
                ist füllung = 2
                        mache etwas anderes
                        */
            }
                                        //letztes Zeichen der Zeile
            System.out.print("#\n");

        }
            // letzte Zeile
            for (int b = 0; b < breite; b++) {
                System.out.print("#");
            }

            System.out.println();



    }
}

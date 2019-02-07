//Scanner importieren,sonst läuft nix: (gehört aber eher in die OOP...
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner
        Scanner derScanner = new Scanner(System.in);
//ich lass mir hier noch Platz für Kommentare
        System.out.println("Wie heisst Du?");
        //hier ist erstmal die Frage,darunter die Anweisung
        String name = derScanner.nextLine();

        System.out.println("Aha, grüss Dich, " + name);

        System.out.println("Und woher kommst Du?");

        String herkunft = derScanner.nextLine();

        System.out.println("Ach, aus " + herkunft);
    }
}

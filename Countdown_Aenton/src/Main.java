import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ich bin ein Zaehler!");

        Scanner meinCountdown = new Scanner(System.in);

        System.out.print("gib einen Countdown-Beginn ein: ");

        int Zahl = meinCountdown.nextInt();

                        // for ( Zaehler Startwert; Bedingung x erfüllt; Zähle runter;)
        for (int zaehler = Zahl; zaehler >= 0; zaehler--) {

            schlafen();

            System.out.println(zaehler);
        }
        System.out.println("des war´s!");
    }

    static void schlafen () {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
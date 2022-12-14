import java.util.Scanner;

public class Quadrierung {
    public static void main(String[] args) {

        System.out.println("Welcome to the Rehearsal of Class 'First Love'");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie in die nächste Zeile eine Zahl zwischen 1 und 100 ein: ");

        int userInput = scanner.nextInt();
        System.out.println("Vielen Dank für Ihren Input. Nachfolgend sehen Sie die Quadrierung von 1 bis zu Ihrer gewählten Zahl. ");
        System.out.println();

        square(userInput);
        result(userInput);

        System.out.println("Ihre Berechnung ist nun beendet. " +
                "Wenn Sie noch zusätzliche Ergebnisse sehen wollen, geben Sie erneut eine Zahl bis 100 ein: ");

        int additionalInput = scanner.nextInt();

        square(userInput);
        additionalResult(userInput, additionalInput);

        System.out.println("Vielen Dank. Noch einen schönen Tag! ");

    }

    private static int result(int n) {

        for (int i=1; i <= n; i++){
            String textausgabe = "Quadrat(" + i + ") = " + square(i);
            System.out.println(textausgabe);
        }

        return n;
    }

    private static int additionalResult (int n, int m) {
        for (int i = n+1 ; i <= m; i++) {

            String neueTextausgabe = "Quadrat(" + i + ") = " + square(i);
            System.out.println(neueTextausgabe);
        }
        return n + m;
    }

    public static int square(int n) {

        return n*n;
        // Achtung nach return kein = notwendig, einfach formel eingeben und dann ;
    }

}

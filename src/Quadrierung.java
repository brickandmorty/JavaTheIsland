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

    }

    private static int result(int n) {

        for (int i=1; i <= n; i++){
            String textausgabe = "Quadrat(" + i + ") = " + square(i);
            System.out.println(textausgabe);
        }

        return n;
    }


    public static int square(int n) {

        return n*n;
        // Achtung nach return kein = notwendig, einfach formel eingeben und dann ;
    }

}

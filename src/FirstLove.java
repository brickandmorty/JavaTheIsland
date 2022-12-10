import java.util.Scanner;

public class FirstLove {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie in der nächsten Zeile eine Zahl n an. " +
                "Das Programm wird dann bis zu dieser Basis quadrieren.");

        int userInput = scanner.nextInt();
        square(userInput);
        result(userInput);

        System.out.println();

        System.out.println("This program shouldn't be called First Love, rather 'First Altercation'. Lol. ");

        // ausgabe (4); >> diese funktion haben wir ohne den Scanner genutzt :)
    }

    /* public static int quadrat ( int n){
    return n * n;
    } */

    public static int square (int n) {
        return n * n;

    }

    public static int result (int n){

        for (int i = 1; i<= n; i++) {
            String string = "Quadrat(" + i + ") = " + square(i);
            System.out.println(string);
        }
        return n;
    }

    /* static void result (int n){
       for (int i = 1; i<= n; i++) {
           String string = "Quadrat(" + i + ") = " + square(i);
            System.out.println(string);
        } */

    /* static void ausgabe ( int n){
        for (int i = 1; i <= n; i = i + 1) {
            String s = "Quadrat(" + i + ") = " + quadrat(i);
            System.out.println(s);
        } */

    }

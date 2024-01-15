import it.epicode.be.error.DivisibilePerZero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int km = 0;

        try {
            calcola(scanner);
        } catch (DivisibilePerZero error) {
            System.out.println(error.getMessage());
            calcola(scanner);
        } catch (Exception error) {
            System.out.println(error.getMessage());
            calcola(scanner);
        }

        scanner.close();

    }

    public static void calcola(Scanner scanner) {
        System.out.print("Inserisci un numero di km percorsi: ");
        int km = Integer.parseInt(scanner.nextLine());

        System.out.print("Inserisci i litri di carburante consumati: ");
        int carburante = Integer.parseInt(scanner.nextLine());

        if (carburante == 0) {
            throw new DivisibilePerZero();
        }

        System.out.println("Km per litro consumati: " + km / carburante);
    }

}


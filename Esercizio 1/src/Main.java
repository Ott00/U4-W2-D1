import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);

        arrayLoop(array, scanner);

        scanner.close();

    }

    public static void arrayLoop(int[] array, Scanner scanner) {
        try {
            while (true) {
                System.out.print("Inserisci un numero (oppure termina il programma digitando '0'): ");
                int number = Integer.parseInt(scanner.nextLine());
                if (number == 0) {
                    System.out.println("Programma terminato");
                    break;
                }
                System.out.print("Inserisci in che posizione debba andare il numero inserito: ");
                int index = Integer.parseInt(scanner.nextLine()) - 1;

                array[index] = number;
                System.out.println(Arrays.toString(array));
            }
        } catch (ArrayIndexOutOfBoundsException error) {
            System.err.print(error.getMessage() + ": ");
            arrayLoop(array, scanner);
        } catch (Exception error) {
            System.err.println(error.getMessage());
            arrayLoop(array, scanner);
        }
    }
}


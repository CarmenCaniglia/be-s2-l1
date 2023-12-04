package Es1;

import java.util.Random;
import java.util.Scanner;

public class Es1 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int [] array = new int[5];
    for (int i = 0; i < array.length; i++){
        array[i] = random.nextInt(1,11); //numeri casuali da 1 a 10
    }

    while (true){
        System.out.println("Array attuale: ");
        for (int value : array){
            System.out.println(value + " ");
        }
        System.out.println();

        try {
            System.out.println("Scegli un numero tra quelli proposti (0 per uscire): ");
            String inputNumber = scanner.nextLine();
            int number = Integer.parseInt(inputNumber);
            if(number == 0){
                break; //esco se clicco 0
            }

            System.out.println("Scegli una posizione da 0 a 4: ");
            String inputPosition = scanner.nextLine();
            int position = Integer.parseInt(inputPosition);

            array[position] = number;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Errore: Posizione non valida!");
        }catch (NumberFormatException e){
            System.out.println("Errore: Inserisci un numero valido!");
        }
    }
    scanner.close();
    System.out.println("Chiusura programma.");
}
}

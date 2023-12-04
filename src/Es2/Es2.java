package Es2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("km percorsi: ");
            double km = Double.parseDouble(scanner.nextLine()); //converto la stringa inserita nello scanner in un double

            System.out.println("Litri di carburante consumati: ");
            double lt = Double.parseDouble(scanner.nextLine());

            if (lt == 0){
                throw new ArithmeticException("I litri non possono essere pari a 0!");
            }

            double kmLitro = km/lt;
            System.out.println("I km/litro percorsi sono: " + kmLitro);
        }catch (NumberFormatException e){
            System.out.println("Valore inserito non valido. Inserisci un numero: ");
        }catch (ArithmeticException e){
            System.out.println("Errore: " + e.getMessage());//getMessage mi dà una descrizione dell'eccezione catturata
        }
        scanner.close();
    }
}

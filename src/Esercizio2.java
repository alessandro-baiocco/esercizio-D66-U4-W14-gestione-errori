import exception.NegativeNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) throws NegativeNumberException {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("inserire km");
            int kmPercorsi = input.nextInt();
            System.out.println("inserire carburante consumato");
            int fuel = input.nextInt();
            if (kmPercorsi >= 0 && fuel >= 0) {
                int fuelOnKm = kmPercorsi / fuel;
                System.out.println("la macchina fa " + fuelOnKm + " al litro");
            } else {
                throw new NegativeNumberException("non è possibile mettere numeri negativi");
            }
        } catch (InputMismatchException ex) {
            System.err.println("input non valido");
        } catch (ArithmeticException ex) {
            System.err.println("non è possibile dividere per 0 o meno");
        } catch (NegativeNumberException ex) {
            System.err.println("non è possibile mettere numeri negativi");
        } catch (Exception ex) {
            System.err.println("errore generico");
        }


    }


}

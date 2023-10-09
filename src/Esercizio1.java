import exception.NotValidInputException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) throws NotValidInputException {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        for (int i = 0; i < 5; i++) {
            number[i] = rnd.nextInt(1, 10);
        }
        stampaValori(input, number);


    }


    public static void stampaValori(Scanner input, int[] number) throws NotValidInputException {
        try (input) {
            while (true) {
                System.out.println(Arrays.toString(number));
                int userInput = input.nextInt();
                if (userInput == 0) break;
                else System.out.println(number[userInput - 1]);
            }
        } catch (InputMismatchException ex) {
            System.err.println("input non valido");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("il massimo è 5");
        } catch (Exception ex) {
            System.err.println("errore generico");
        }


    }
}
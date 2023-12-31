import com.sun.tools.javac.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        for (int i = 0; i < 5; i++) {
            number[i] = rnd.nextInt(1, 10);
        }
        stampaValori(input, number);
    }


    public static void stampaValori(Scanner input, int[] number) {
        try (input) {
            while (true) {
                log.info(Arrays.toString(number));
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
        } finally {
            input.close();
        }


    }
}
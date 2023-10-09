package exception;

public class NotValidInputException extends Exception {
    public NotValidInputException(int userInput) {
        super("il numero " + userInput + " non è valido");
    }
}

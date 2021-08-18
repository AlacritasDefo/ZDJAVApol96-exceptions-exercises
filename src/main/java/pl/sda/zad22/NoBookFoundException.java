package pl.sda.zad22;

public class NoBookFoundException extends RuntimeException {
    public NoBookFoundException(String message) {
        super(message);
    }
}

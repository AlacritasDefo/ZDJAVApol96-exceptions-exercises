package pl.sda.zadanie2;

public class UserWithGivenNickNotException extends RuntimeException {
    public UserWithGivenNickNotException(String message) {
        super(message);
    }
}

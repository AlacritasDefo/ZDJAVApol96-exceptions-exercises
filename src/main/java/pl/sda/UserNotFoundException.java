package pl.sda;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message){
        super (message);
    }
}

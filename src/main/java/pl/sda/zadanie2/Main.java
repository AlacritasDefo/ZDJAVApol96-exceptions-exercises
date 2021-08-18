package pl.sda.zadanie2;

public class Main {
    public static void main(String[] args) {
        UserStorage storage = new UserStorage();

        storage.setUser(new User("flip", "Flip", "Flap"));

        try {
            System.out.println(storage.hasUserNick("flap"));
        } catch (UserWithGivenNickNotException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

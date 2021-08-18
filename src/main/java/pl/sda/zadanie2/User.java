package pl.sda.zadanie2;

public class User {
    private String nick;
    private String firstName;
    private String lastName;

    public User(String nick, String firstName, String lastName) {
        this.nick = nick;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getNick() {
        return nick;
    }
}

package pl.sda.zadanie2;

public class UserStorage {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void deleteUser() {
        user = null;
    }

    public boolean hasUserNick(String nickname) {
        if (user != null && !user.getNick().equals(nickname)) {
            throw new UserWithGivenNickNotException("Nick nie zgadza się z userem.");
        }

        return true;
    }
}

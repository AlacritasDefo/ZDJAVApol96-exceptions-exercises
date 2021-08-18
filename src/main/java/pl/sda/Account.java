package pl.sda;

public class Account {
    private float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public void payIn(float payin) {
        balance = balance + payin;
    }

    public void withdraw(float payout) throws AccountBalanceToLowException {
        balance = balance - payout;
        if (balance < payout) {
            throw new AccountBalanceToLowException("Podana kwota wypłaty jest większa od Stanu konta");
        }

    }
}

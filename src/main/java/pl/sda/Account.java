package pl.sda;
/*
Do klasy Account z poprzedniego zadania dodaj
metodę do zwracania aktualnego stanu konta. W klasie
Main wywołaj metodę wypłać i obsłuż wyjątek w bloku try /
catch, jeśli kwota do wypłaty będzie wyższa niż stan konta
to przechwyć wyjątek i wypłać wszystko co jest na koncie.
 */
public class Account {
    private float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public void payIn(float payin) {
        balance = balance + payin;
    }
    public void withdraw(float payout) throws AccountBalanceToLowException, AmountLessThanZeroException {
        if (payout < 0) {
            throw new AmountLessThanZeroException("Podana kwota wypłaty jest mniejsza od 0");
        }else if (balance < payout) {
            throw new AccountBalanceToLowException("Podana kwota wypłaty jest większa od Stanu konta");
        }
        balance = balance - payout;
    }

    public float balanceActual() {
        return balance;
    }

    public void withdrawAll() {
        balance=0;
    }
}

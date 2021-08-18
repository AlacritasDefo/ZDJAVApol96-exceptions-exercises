package pl.sda;
/*
Zaimplementuj klasę Account z 1 polem typu float balance. I wystaw
metody do wypłacania i wpłacania zadanej sumy pieniędzy. Przy
wypłacaniu, jeśli kwota do wypłacenia będzie wyższa niż stan konta, wyrzuć
AccountBalanceToLowException z poprzednich zadań. Obsłuż ten wyjątek
z wykorzystaniem throws w klasie Account.
 */

public class Account1 {
    private float balance;

    public Account1(float balance) {
        this.balance = balance;
    }

    public void withdraw(float amount) throws AccountBalanceToLowException {
        if (balance < amount) {
            throw new AccountBalanceToLowException("Zadana kwota większa od stanu konta");
        }
        balance -= amount;
    }

    public void payIn(float amount) {
        balance += amount;
    }
}

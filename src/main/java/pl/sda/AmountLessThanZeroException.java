package pl.sda;

public class AmountLessThanZeroException extends Exception{
    /*Zaimplementuj nowy wyjątek typu checked AmountLessThanZeroException.
    Do metody służącej do wypłaty w klasie Account z poprzednich zadań,
    dodaj sprawdzenie czy kwota do wypłaty nie jest mniejsza od 0. Jeśli jest to wyrzuć wyjątek.
    Obsłuż go w klasie Main z wykorzystaniem dodatkowego catcha.*/
    public AmountLessThanZeroException(String message) {
        super(message);
    }
}

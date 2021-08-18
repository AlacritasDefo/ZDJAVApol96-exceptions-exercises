package pl.sda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Account konto1 = new Account(200.0f);

        try {
            konto1.withdraw(250.0f);
        } catch (AccountBalanceToLowException exception) {
            System.out.println(exception.getMessage());
            konto1.withdrawAll();
        }
        System.out.println(konto1.balanceActual());
    }
}

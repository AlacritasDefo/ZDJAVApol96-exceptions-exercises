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
            konto1.withdraw(-50.0f);
        } catch (AccountBalanceToLowException exception) {
            System.out.println(exception.getMessage());
            konto1.withdrawAll();
        } catch (AmountLessThanZeroException exception) {
            System.out.println(exception.getMessage());
        }
        finally {
            konto1.payIn(100.0f);
        }
        System.out.println(konto1.balanceActual());
    }
}

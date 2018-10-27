package assignment6.b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import assignments.assignment6.b.Account;
import assignments.assignment6.b.CheckingAccount;
import assignments.assignment6.b.Setting;
import org.junit.jupiter.api.Test;


public class AccountTest {

    @Test
    void accountTypeTest() {
        Account account = new Account("Petter", "Ma", 100);
        String type = account.getAcctType();
        assertEquals("Account", type);
    }

    @Test
    void DebitTransactionTest() {
        CheckingAccount checkingAccount = new CheckingAccount("Petter", "Ma", 200);
        double balance = checkingAccount.DebitTransaction(10);
        assertEquals(190, balance);
    }

    @Test
    void DebitTransactionTest2() {
        CheckingAccount checkingAccount = new CheckingAccount("Petter", "Ma", 200);
        double balance = checkingAccount.DebitTransaction(100);
        assertEquals(100, balance);

    }

    @Test
    void DebitTransactionTest3() {
        CheckingAccount checkingAccount = new CheckingAccount("Petter", "Ma", 200);
        double balance = checkingAccount.DebitTransaction(101);
        assertEquals(97, balance);
    }

    @Test
    void DebitTransactionTest4() {
        CheckingAccount checkingAccount = new CheckingAccount("Petter", "Ma", 90);
        double balance = checkingAccount.DebitTransaction(10);
        assertEquals(78, balance);
        balance = checkingAccount.DebitTransaction(10);
        assertEquals(66, balance);
    }

    @Test
    void CreditTransactionTest() {
        CheckingAccount checkingAccount = new CheckingAccount("Petter", "Ma", 90);
        double balance = checkingAccount.CreditTransaction(10);
        assertEquals(100, balance);
    }

    @Test
    void CreditTransactionTest2() {
        CheckingAccount checkingAccount = new CheckingAccount("Petter", "Ma", 90);
        double balance = checkingAccount.CreditTransaction(9);
        assertEquals(97, balance);
    }

    @Test
    void CreditTransactionTest3() {
        CheckingAccount checkingAccount = new CheckingAccount("Petter", "Ma", 97);
        double balance = checkingAccount.CreditTransaction(2);
        assertEquals(97, balance);
        balance = checkingAccount.CreditTransaction(2);
        assertEquals(97, balance);
        balance = checkingAccount.CreditTransaction(2);
        assertEquals(97, balance);
    }

    @Test
    void toStringTest() {
        CheckingAccount checkingAccount = new CheckingAccount("Petter", "Ma", 97);
        String result = checkingAccount.toString();
        assertEquals("Account name: Petter Ma, Account Type: Account, Balance $97.0", result);
    }

    @Test
    void toStringTest2() {
        CheckingAccount checkingAccount = new CheckingAccount("Petter", "Ma", 100);
        String result = checkingAccount.toString();
        assertEquals("Account name: Petter Ma, Account Type: Account, Balance $100.0", result);
    }

    @Test
    void toStringTest3() {
        CheckingAccount checkingAccount = new CheckingAccount("W", "Ma", 100);
        String result = checkingAccount.toString();
        assertEquals("Account name: W Ma, Account Type: Account, Balance $100.0", result);
    }

    @Test
    void setting() {
        assertEquals(100, Setting.minBalance);
        assertEquals(2, Setting.fee);
    }
}

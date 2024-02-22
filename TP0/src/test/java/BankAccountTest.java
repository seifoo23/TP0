// BankAccountTest.java

import org.example.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDepositWithNegativeAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50);
        });
    }

    @Test
    public void testDepositWithPositiveAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdrawWithNegativeAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50);
        });
    }

    @Test
    public void testWithdrawWithInsufficientBalance() {
        BankAccount account = new BankAccount(100, 0.05);
        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(150);
        });
    }

    @Test
    public void testWithdrawValidAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    public void testTransferWithNullOtherAccount() {
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = null;
        assertThrows(NullPointerException.class, () -> {
            account1.transfer(50, account2);
        });
    }

    @Test
    public void testTransferWithZeroAmount() {
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = new BankAccount(200, 0.05);
        account1.transfer(0, account2);
        assertEquals(100, account1.getBalance());
        assertEquals(200, account2.getBalance());
    }

    @Test
    public void testAddInterestInterestRate() {
        BankAccount account = new BankAccount(100, 0.05);
        account.addInterest();
        assertEquals(105, account.getBalance());
    }

}

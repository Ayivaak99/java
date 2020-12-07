package main.tutorials.masterclass.junit;

import org.junit.After;

import static org.junit.Assert.*;

public class BankAccountTest {

    private static int count;
    private BankAccount account;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes once before any test cases. Count = " + count++);
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes once after all test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("Kaaviya", "Ramkumar", 1000.00, BankAccount.CHECKING);
        System.out.println("Running tests...");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
        account.withdraw(600.00, false);
        fail("Should have thrown an IllegalArgumentException");

    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        assertTrue("The account is NOT a checking account", account.isChecking());
    }

    @org.junit.After
    public void tearDown() {
        System.out.println("Count = " + count++);
    }
}
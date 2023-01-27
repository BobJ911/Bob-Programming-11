import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;
import java.sql.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Tester {
    Customer test;
    
    @Before
    public void setup()
    {
        test = new Customer();
    }

    @Test
    public void deposit(){
        test.deposit(500, new Date(2002, 5, 13), "Saving");
        assertTrue(test.getSavingBalance() == 500);

        test.deposit(2400, new Date(2002, 5, 13), "Checking");
        assertTrue(test.getCheckBalance() == 2400);
    }

    @Test
    public void withdraw(){
        test.deposit(500, new Date(2002, 5, 13), "Saving");
        test.withdraw(200, new Date(2002, 5, 13), "Saving");
        test.withdraw(295825,new java.util.Date(),"Saving");
        assertTrue(test.getSavingBalance() == 300);

        test.deposit(500, new Date(2002, 5, 13), "Checking");
        test.withdraw(300, new Date(2002, 5, 13), "Checking");
        test.withdraw(25285,new java.util.Date(),"Checking");
        assertTrue(test.getCheckBalance() == 200);
    }

    @Test
    public void depositToString(){
        test.deposit(500, new Date(2002, 5, 13), "Checking");
        assertTrue(test.deposits.toString().equals("[Deposit of: $500.0 Date: 3902-06-13 into account: Checking\n" +
                "Current Balance in Checking is: $500.0]"));

        test.deposit(500, new Date(2002, 5, 13), "Saving");
        assertTrue(test.deposits.toString().equals("[Deposit of: $500.0 Date: 3902-06-13 into account: Checking\n" +
                "Current Balance in Checking is: $500.0, Deposit of: $500.0 Date: 3902-06-13 into account: Saving\n" +
                "Current Balance in Saving is: $500.0]"));
    }

    @Test
    public void withdrawToString(){
        test.deposit(1000, new Date(2002, 5, 13), "Checking");
        test.deposit(1000, new Date(2002, 5, 13), "Saving");
        test.withdraw(500, new Date(2002, 5, 13), "Saving");
        assertTrue(test.withdraws.toString().equals("[Withdraw of: $500.0 Date: 3902-06-13 into account: Saving\n" +
                "Current Balance in Saving is: $500.0]"));

        test.withdraw(500, new Date(2002, 5, 13), "Checking");
        assertTrue(test.withdraws.toString().equals("[Withdraw of: $500.0 Date: 3902-06-13 into account: Saving\n" +
                "Current Balance in Saving is: $500.0, Withdraw of: $500.0 Date: 3902-06-13 into account: Checking\n" +
                "Current Balance in Checking is: $500.0]"));
    }
}

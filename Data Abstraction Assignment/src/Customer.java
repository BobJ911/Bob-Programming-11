import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    public ArrayList<Deposit> deposits;
    public ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -1;

    //requires: nothing, modifies: nothing, effect: getter for checkBalance
    public double getCheckBalance()
    {
        return checkBalance;
    }
    //requires: nothing, modifies: nothing, effect: getter for savingBalance
    public double getSavingBalance()
    {
        return savingBalance;
    }

    //requires: nothing, modifies: nothing, effect: creates an example customer
    Customer(){
        this.name = "Bob Jiang";
        this.deposits = new ArrayList();
        this.withdraws = new ArrayList();
        this.checkBalance = 0.0;
        this.savingBalance = 0.0;
    }

    //requires: nothing, modifies: nothing, effect: getter for name
    public String getName()
    {
        return name;
    }

    //requires: name, modifies: name variable in class, effect: setter for name, sets name in the class to the value of name in the method
    public void setName(String name)
    {
        this.name = name;
    }

    //requires: name, accountNumber, checkDeposit, savingDeposit, modifies: name, accountNumber, possibly deposit to saving or checking, effect: creates a customer based on the user's input
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.deposits = new ArrayList();
        this.withdraws = new ArrayList();
        this.deposit(checkDeposit, new Date(), "Checking");
        this.deposit(savingDeposit, new Date(), "Saving");
    }

    //requires: amt, date, account, modifies: savingBalance or savingBalance, also adds a new deposit, effect: Deposits a sum of money set by the user either into saving or checking
    public double deposit(double amt, Date date, String account){
        //your code here
        if(account.equals("Saving")){
            this.savingBalance += amt;
            this.deposits.add(new Deposit(amt, date, "Saving", savingBalance));
            return this.savingBalance;
        }
        if(account.equals("Checking")){
            this.checkBalance += amt;
            this.deposits.add(new Deposit(amt, date, "Checking", checkBalance));
            return this.checkBalance;
        }else{
            return 0;
        }
    }

    //requires: amt, date, account, modifies: checkBalance or savingBalance, effect: Withdraws a certain amount set by the user either from checking or saving
    public double withdraw(double amt, Date date, String account){
        //your code here
        if (account.equals("Checking") && this.checkOverdraftChecking(amt)) {
            this.checkBalance -= amt;
            this.withdraws.add(new Withdraw(amt, date, "Checking", checkBalance));
            return this.checkBalance;
        }else if (account.equals("Saving") && this.checkOverdraftSaving(amt)) {
            this.savingBalance -= amt;
            this.withdraws.add(new Withdraw(amt, date, "Saving", savingBalance));
            return this.savingBalance;
        }else if(account.equals("Checking")&&!this.checkOverdraftChecking(amt)){
            System.out.println("OVERDRAFT WARNING! WITHDRAW OF $"+amt+" TO " + account+ " WILL NOT BE COUNTED");
            System.out.println();
            return this.checkBalance;
        }else if(account.equals("Saving")&&!this.checkOverdraftSaving(amt)){
            System.out.println("OVERDRAFT WARNING! WITHDRAW OF $"+amt+" TO " + account+ " WILL NOT BE COUNTED");
            System.out.println();
            return this.savingBalance;
        }else
        {
            return 0;
        }
    }

    //requires: amt, modifies: nothing, effect: checks for overdraft from the checking account
    private boolean checkOverdraftChecking(double amt) {
        return this.checkBalance - amt >= -1.0;
    }

    //requires: amt, modifies: nothing, effect: checks for overdraft from the saving account
    private boolean checkOverdraftSaving(double amt) {
        return this.savingBalance - amt >= -1.0;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
            System.out.println();
        }
    }
}

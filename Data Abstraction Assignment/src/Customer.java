import javax.security.sasl.SaslClient;
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

    public double getCheckBalance()
    {
        return checkBalance;
    }

    public double getSavingBalance()
    {
        return savingBalance;
    }

    Customer(){
        this.name = "Bob Jiang";
        this.deposits = new ArrayList();
        this.withdraws = new ArrayList();
        this.checkBalance = 0.0;
        this.savingBalance = 0.0;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.deposits = new ArrayList();
        this.withdraws = new ArrayList();
        this.deposit(checkDeposit, new Date(), "Checking");
        this.deposit(savingDeposit, new Date(), "Saving");
    }

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

    private boolean checkOverdraftChecking(double amt) {
        return this.checkBalance - amt >= -1.0;
    }

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

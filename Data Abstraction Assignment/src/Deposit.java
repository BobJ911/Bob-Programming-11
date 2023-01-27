import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;
    private double total;
    Deposit(double amount, Date date, String account, double total){
        this.amount = amount;
        this.date = date;
        this.account = account;
        this.total = total;
    }

    public String toString() {
        return "Deposit of: $" + this.amount + " Date: " + this.date + " into account: " + this.account + "\nCurrent Balance in " + this.account+ " is: $"+ this.total;
    }
}

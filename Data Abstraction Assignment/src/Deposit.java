import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;
    private double total;

    //requires: amount, date, account, total, modifies: amount variable in class, date variable in class, account variable in class, and total variable in class, effect: updates all the variables in this class to what the parameters are for the method
    Deposit(double amount, Date date, String account, double total){
        this.amount = amount;
        this.date = date;
        this.account = account;
        this.total = total;
    }

    //requires: nothing, modifies: nothing, effect: returns a string which is saved into saving history in the correct format
    public String toString() {
        return "Deposit of: $" + this.amount + " Date: " + this.date + " into account: " + this.account + "\nCurrent Balance in " + this.account+ " is: $"+ this.total;
    }
}

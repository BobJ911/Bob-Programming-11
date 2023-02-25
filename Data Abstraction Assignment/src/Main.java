import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Customer customer1 = new Customer();
        Scanner s1 = new Scanner(System.in);
        for(int i = 0; i< Integer.MAX_VALUE; i++){
            all(s1, customer1);
            System.out.println();
        }
    }

    //function for a program of if statements of all the actions the user can do
         static void all(Scanner s1,Customer customer1)
         {
             System.out.println("What would you like to do? Deposit, Withdraw, Display Deposits or Display Withdraws?");
             String A = s1.nextLine();
             if(A.equals("Deposit")||A.equals("Withdraw"))
             {
                 System.out.println("Saving or Checking?");
                 String B = s1.nextLine();

                 if(B.equals("Saving")||B.equals("Checking")){
                     System.out.println("Amount?");
                     double C = s1.nextDouble();

                     if (A.equals("Deposit"))
                     {
                         if (B.equals("Saving"))
                         {
                             customer1.deposit(C, new java.util.Date(), "Saving");
                         } else if (B.equals("Checking"))
                         {
                             customer1.deposit(C, new java.util.Date(), "Checking");
                         }
                     } else if (A.equals("Withdraw"))
                     {
                         if (B.equals("Saving"))
                         {
                             customer1.withdraw(C, new java.util.Date(), "Saving");
                         } else if (B.equals("Checking"))
                         {
                             customer1.withdraw(C, new java.util.Date(), "Checking");
                         }
                     }
                 }else{
                     System.out.println("Please input a valid operation");
                 }
             }else if(A.equals("Display Deposits")){
                 customer1.displayDeposits();
                 if(customer1.deposits.size() == 0){
                     System.out.println("No Deposits yet");
                 }
             }else if(A.equals("Display Withdraws")){
                 customer1.displayWithdraws();
                 if(customer1.withdraws.size() == 0){
                     System.out.println("No Withdraws yet");
                 }
             }else{
                 System.out.println("Please input a valid operation");
             }
         }
    }
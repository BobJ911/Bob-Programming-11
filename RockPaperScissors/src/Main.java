import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Choose rock paper or scissors. \'r\' for rock, \'p\' for paper and \'s\' for scissors.");
        Scanner s1 = new Scanner(System.in);
        String user = s1.nextLine();
        String player = "1";


        String computer = "1";
        double ran = (double)Math.random()*100;
        if (ran >= 0&&ran <= 30){
            computer = "rock";
        }
        if (ran > 30&&ran <= 60){
            computer = "scissors";
        }
        if (ran > 60&&ran <= 100){
            computer = "paper";
        }
        if (user.equals("r")){
            player = "rock";
        }
        if (user.equals("p")){
            player = "paper";
        }
        if (user.equals("s")) {
            player = "scissors";
        }

        if (player.equals("scissors")&&computer == "scissors"){
            System.out.println("Draw!");
        }
        if (player.equals("scissors")&&computer == "rock"){
            System.out.println("You Lose!");
        }
        if (player.equals("scissors")&&computer == "paper"){
            System.out.println("You Win!");
        }

        if (player.equals("paper")&&computer == "paper"){
            System.out.println("Draw!");
        }
        if (player.equals("paper")&&computer == "rock"){
            System.out.println("You Win!");
        }
        if (player.equals("paper")&&computer == "scissors"){
            System.out.println("You Lose!");
        }

        if (player.equals("rock")&&computer == "rock"){
            System.out.println("Draw!");
        }
        if (player.equals("rock")&&computer == "paper"){
            System.out.println("You Lose!");
        }
        if (player.equals("rock")&&computer == "scissors"){
            System.out.println("You Win!");
        }


        if (player.equals("rock") || player.equals("paper") || player.equals("scissors")) {
            System.out.println("Computer choice: " + computer + "\t" + "Player choice: " + player);
        }else{
            System.out.println("Invalid selection please play again.");
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int L = 0;
        int W = 0;
        System.out.println("Choose rock paper or scissors. \'r\' for rock, \'p\' for paper and \'s\' for scissors.");//tells the user what to input
        Scanner s1 = new Scanner(System.in);//sets up a scanner
        for (int i =1; i ==1; i++) {
            System.out.println("Wins: "+W+" Losses: "+L);
            String user = s1.nextLine();//gets a letter from the user
            String player = "1";
            String computer = "1";
            double ran = (double) Math.random() * 100;//random number generator

            if (ran >= 0 && ran <= 30) {//if less than 30 then computer choose rock
                computer = "rock";
            }
            if (ran > 30 && ran <= 60) {//if less than 60 but more than 30 then computer choose scissors
                computer = "scissors";
            }
            if (ran > 60 && ran <= 100) {//if less than 100 but more than 60 computer choose paper
                computer = "paper";
            }
            if (user.equals("r")) {//if player input r, variable player is equal to rock
                player = "rock";
            }
            if (user.equals("p")) {//if player input p, variable player is equal to paper
                player = "paper";
            }
            if (user.equals("s")) {//if player input s, variable player is equal to scissors
                player = "scissors";
            }

            if (player.equals("scissors") && computer == "scissors") {//if player choose scissors and computer choose scissors, print Draw!
                System.out.println("Draw!");
            }
            if (player.equals("scissors") && computer == "rock") {//if player choose scissors and computer choose rock, print You Lose!
                System.out.println("You Lose!");
                L++;
            }
            if (player.equals("scissors") && computer == "paper") {//if player choose scissors and computer choose paper, print You Win!
                System.out.println("You Win!");
                W++;
            }

            if (player.equals("paper") && computer == "paper") {//if player choose paper and computer choose paper, print Draw!
                System.out.println("Draw!");
            }
            if (player.equals("paper") && computer == "rock") {//if player choose paper and computer choose rock, print You Win!
                System.out.println("You Win!");
                W++;
            }
            if (player.equals("paper") && computer == "scissors") {//if player choose paper and computer choose scissors, print You Lose!
                System.out.println("You Lose!");
                L++;
            }

            if (player.equals("rock") && computer == "rock") {//if player choose rock and computer choose rock, print Draw!
                System.out.println("Draw!");
            }
            if (player.equals("rock") && computer == "paper") {//if player choose rock and computer choose paper, print You Lose!
                System.out.println("You Lose!");
                L++;
            }
            if (player.equals("rock") && computer == "scissors") {//if player choose rock and computer choose scissors, print You Win!
                System.out.println("You Win!");
                W++;
            }


            if (player.equals("rock") || player.equals("paper") || player.equals("scissors")) {//if player entered valid letter, print out computer choice and player choice
                System.out.println("Computer choice: " + computer + "\t" + "Player choice: " + player);
            } else if (user.equals("x")){
                break;
            } else {
                System.out.println("Invalid selection please play again.");// else print out invalid selection statement
            }
            i--;
            System.out.println("************************************************");
        }
        System.out.println("Thank you for playing");
    }
}
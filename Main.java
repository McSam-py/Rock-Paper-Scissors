package Question1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        Random randomNum = new Random();
        System.out.println("Welcome to rock, paper, scissors.");
        System.out.println("Enter your username: ");
        String user2 = takeInput.nextLine();
        String possibles [] = {"rock", "paper", "scissors"};
        int computerScore = 0;
        int user2Score = 0;

        int count = 1;
        while (count <= 5){
            //Obtaining the choice of the computer.
            int computerChoice = randomNum.nextInt(possibles.length);

            //Obtaining the user input or the choice of the user.
            System.out.println("Choose between rock, paper or scissors: ");
            String user2choice = takeInput.nextLine().toLowerCase();
            if (user2choice.equals(possibles[computerChoice])){
                System.out.println("It's a tie!!!");
            }
            else if(user2choice.equals("rock") && possibles[computerChoice].equals("paper")){
                computerScore++;
            }
            else if(user2choice.equals("paper") && possibles[computerChoice].equals("rock")){
                user2Score++;
            }
            else if(user2choice.equals("paper") && possibles[computerChoice].equals("scissors")){
                computerScore++;
            }
            else if(user2choice.equals("scissors") && possibles[computerChoice].equals("paper")){
                user2Score++;
            }
            else if (user2choice.equals("rock") && possibles[computerChoice].equals("scissors")){
                user2Score++;
            }
            else if (user2choice.equals("scissors") && possibles[computerChoice].equals("rock")){
                computerScore++;
            }
            else{
                System.out.println("You have entered an illegal input.");
            }
            System.out.println("Computer Played: "+possibles[computerChoice]);
            count++;
        }
        System.out.println("\n-------Scores-------"+"\nComputer's Score: "+computerScore+"\n"+user2+"'s score: "+user2Score);
    if (user2Score > computerScore){
        System.out.println("\n"+user2+" Won the game!!");
    }
    else if (user2Score==(computerScore)) {
        System.out.println("\nIt's a tie!!");
    }
    else{
        System.out.println("\nYou Lost :)");
    }
    }
}

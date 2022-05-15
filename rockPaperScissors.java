package Question1;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in); //Creating an object of the Scanner class
        Random randomNum = new Random(); //Creating an object of the Random class
        System.out.println("Welcome to rock, paper, scissors.");
        System.out.println("Enter your username: ");
        String user2 = takeInput.nextLine(); //Taking the user's name from the console
        String possibles[] = {"rock", "paper", "scissors"}; //Array containing a list of options the computer can choose from.
        int computerScore = 0; //Setting the initial score of the computer to Zero
        int user2Score = 0; //Setting the initial score of the user to Zero

        int count = 1; //Variable to regulate the number of times a user can play the game.
        while (count <= 5) {
            //Obtaining the choice of the computer.
            int computerChoice = randomNum.nextInt(possibles.length);

            //Obtaining the user input or the choice of the user.
            System.out.println("Choose between rock, paper or scissors: ");
            String user2choice = takeInput.nextLine().toLowerCase();

            //Conditions to check who will be awarded a point.
            if (user2choice.equals(possibles[computerChoice])) {
                System.out.println("It's a tie!!!");//No points are awarded to any of the players.
            } else if (user2choice.equals("rock") && possibles[computerChoice].equals("paper")) {
                computerScore++;//a point is awarded to the computer
            } else if (user2choice.equals("paper") && possibles[computerChoice].equals("rock")) {
                user2Score++;
            } else if (user2choice.equals("paper") && possibles[computerChoice].equals("scissors")) {
                computerScore++;
            } else if (user2choice.equals("scissors") && possibles[computerChoice].equals("paper")) {
                user2Score++;
            } else if (user2choice.equals("rock") && possibles[computerChoice].equals("scissors")) {
                user2Score++;
            } else if (user2choice.equals("scissors") && possibles[computerChoice].equals("rock")) {
                computerScore++;
            } else {
                System.out.println("You have entered an illegal input.");
            }

            //Print statement to show which random choice the computer made after the user makes a choice.
            System.out.println("Computer Played: " + possibles[computerChoice]);
            count++;
        }

        //Printing out the scores of the two users.
        System.out.println("\n-------Scores-------" + "\nComputer's Score: " + computerScore + "\n" + user2 + "'s score: " + user2Score);

        //Condition to check who won at the end of the game.
        if (user2Score > computerScore) {
            System.out.println("\n" + user2 + " Won the game!!");
        } else if (user2Score == (computerScore)) {
            System.out.println("\nIt's a tie!!");
        } else {
            System.out.println("\nYou Lost :)");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise04_gra_avena;
import java.util.Scanner;


/**
 *
 * @author Haisuri
 */
public class Exercise04_GRA_Avena {
    
    static int option = 0;
    static Scanner scanner = new Scanner(System.in);
    static boolean isPlaying = false;
    static int roundsToWin = 2;
    static Move rock = new Move("Rock");
    static Move paper = new Move("Paper");
    static Move scissors = new Move("Scissors");
    static int player_score = 0;
    static int ai_score = 0;
    static int round_counter = 0;
    
    public static void main(String[] args) {
        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);
        int result = 1;
        Move AI_move = rock;
        Move Player_move = rock;
        mainMenu();
        System.out.println("Mat1ch is first to " + roundsToWin + "\n");
        while (isPlaying) {
            AI_move = randomMove();
            System.out.print("[Round " + round_counter + "] ");
            System.out.println("The computer has selected its move. Select your move.");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            do {
                option = getIntInput();
                if (option < 0 || option > 3) {
                    System.out.println("Invalid input. Please re-enter.");
                } else {
                    break;
                }
            } while(true);
            System.out.println();
            switch (option) {
                case 1:
                    Player_move = rock;
                    break;
                case 2:
                    Player_move = paper;
                    break;
                case 3:
                    Player_move = scissors;
                    break;
            }
            
            result = Move.compareMoves(Player_move, AI_move);
            System.out.print("Player picked " + Player_move.getName() + ". AI picked " + AI_move.getName() + ". ");
            switch (result) {
                case 0:
                    System.out.println("Player won.");
                    player_score++;
                    break;
                case 1:
                    System.out.println("AI won.");
                    ai_score++;
                    break;
                case 2:
                    System.out.println("Tie.");
                    break;
            }
            System.out.println("Player score " + player_score + " AI score: " + ai_score);
            if (player_score >= roundsToWin) {
                isPlaying = false;
                System.out.println("Player won the game.");
                mainMenu();
            } else if (ai_score >= roundsToWin) {
                isPlaying = false;
                System.out.println("AI won the game.");
                mainMenu();
            }
            round_counter++;
        }
        
    }
    
    static Move randomMove() {
        int random = (int) Math.floor(Math.random()*3) + 1;
        if (random == 1) {
            return rock;
        } else if (random == 2) {
            return paper;
        } else if (random == 3) {
            return scissors;
        }
        return null;
    }
    static void mainMenu() {
        boolean notInBounds = false;
        System.out.println("\nWelcome to Rock, Paper, Scissors. Please choose an option:");
        System.out.println("1. Start game");
        System.out.println("2. Change number of rounds");
        System.out.println("3. Exit application");
        do {
            option = getIntInput();
            switch (option) {
                case 1:
                    player_score = 0;
                    round_counter = 1;
                    ai_score = 0;
                    notInBounds = false;
                    isPlaying = true;
                    break;
                case 2:
                    notInBounds = false;
                    setRounds();
                    mainMenu();
                    break;
                case 3:
                    notInBounds = false;
                    isPlaying = false;
                    break;
                default:
                    notInBounds = true;
                    System.out.println("Input not in bounds. Please re-enter.");
                    break;
                }
            } while (notInBounds);        
    }
    static int getIntInput() {
        System.out.print("> ");
        int input = scanner.nextInt();
        return input;
    }
    static void setRounds() {
        System.out.println("Change number of rounds. Previous: " + roundsToWin);
        roundsToWin = getIntInput();
        System.out.println("New number of rounds: " + roundsToWin);
    }
}

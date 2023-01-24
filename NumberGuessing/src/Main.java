import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Welcome to Number Guessing game :)");
        System.out.println("You have got 5 attempts to guess the number");
        System.out.println("\nEnter 1 to START the game\nEnter 0 to END the game");
        int ui = sc.nextInt();
        int Round=0;
        while (ui != 0) {
            Round++;
            System.out.printf("Round - %d\n",Round);
            int random = rn.nextInt(0, 100);
            int trail = 1;
            while (trail <= 5) {
                System.out.printf("Attempt: %d%n", trail);
                System.out.println("Enter a number:");
                int userInput = sc.nextInt();
                if (random == userInput){
                    System.out.println("Hurray!! You've guessed the number.");
                    break;
                }
                else {
                    System.out.println("Wrong guess:(");
                    if (userInput < random) System.out.println("HINT: You've guessed a small number\n");
                    else System.out.println("HINT: You've guessed a big number\n");
                }
                trail++;
            }
            System.out.printf("The correct Number is %d",random);
            System.out.println("\nEnter 1 to START the game....\nEnter 0 to END the game");
            ui = sc.nextInt();
        }
        System.out.println("Thanks for playing....");
        System.out.printf("Total rounds played= %d",Round);
    }
}
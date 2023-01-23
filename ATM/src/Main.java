import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> th=new ArrayList<>();
    public static int balance=5000;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n\nWELCOME TO SAMANVI's ATM \n");
        System.out.println("Enter your USERNAME:");
        String userName = sc.nextLine();
        DataSource d = new DataSource();
        if (d.query(userName)) {
            System.out.println("Enter PASSCODE:");
            int ss = 0;
            int attempts = 3;
            while (attempts > 0) {
                String s = sc.nextLine();
                attempts--;
                if (d.db(userName, s)) {
                    System.out.println("Correct passcode :)");
                    ss = 1;
                    break;
                } else {
                    System.out.println("Wrong passcode");
                    System.out.printf("You have %d attempts remaining\n", attempts);
                }
            }
            if (ss == 1) {
                Instructions();
                int choice = sc.nextInt();
                while (choice != 5) {
                    switch (choice) {
                        case 1 -> {
                            new Withdraw();
                            Instructions();
                        }
                        case 2 -> {
                            new Deposit();
                            Instructions();
                        }
                        case 3 -> {
                            new TransactionHistory();
                            Instructions();
                        }
                        case 4 -> {
                            new Transfer();
                            Instructions();
                        }
                    }
                    choice = sc.nextInt();
                }
                System.out.println("Thanks for visiting SAMANVI's ATM :)\n WE WISH YOU A HAPPY DAY AHEAD");
            } else
                System.out.println("You've entered wrong passcode too many times.\nThanks for visiting our SAMANSaVI ATM.\nPlease visit again");

        }
        else System.out.println("THIS USER DOESN'T SEEM TO EXIST\n\"Thanks for visiting SAMANVI's ATM :)\n WE WISH YOU A HAPPY DAY AHEAD");
    }
    public static void Instructions(){
        System.out.println("""

                INSTRUCTIONS:
                1:Withdraw
                2:Deposit
                3:Transaction History
                4:Transfer
                5:Quit
                """);
        System.out.println("Enter your choice");
    }
}

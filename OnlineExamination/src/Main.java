import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static ArrayList<String> choices=new ArrayList<>();
    public static ArrayList<String> Answers=new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("\n\n    ONLINE EXAMINATION            \n");
        System.out.println("Enter your login credentials");
        Answers.add("1");
        Answers.add("3");
        Answers.add("2");
        int rrr=login();
        if(rrr==2) {
            Mains mains = new Mains();
            int n =0;
            int c1=0;
            while (n < 6) {
                studentInstructions();
                n = sc.nextInt();

                switch (n) {
                    case 1 -> {
                        if(c1==0) {
                            c1+=1;
                            mains.Questions();
                        }
                        else System.out.println("You've already attempted this test.If you want to review your answers select OPTION-3");
                    }
                    case 2 -> System.out.println("ADVANCED model section is yet to be added");

                    case 3 -> {
                        choices.clear();
                        mains.Review();
                    }
                    case 4 -> System.out.println("ADVANCED model REVIEW section is yet to be added");
                    case 5 -> {
                        if(!choices.isEmpty()) System.out.println("Your final answers are: "+choices);
                        else System.out.println("You did not attempt a single question.");
                    }
                    case 6 -> mains.Evaluate();

                    default -> System.out.println("Enter correct value");
                }
            }
        }
        else if(rrr==1){
            Admin admin=new Admin();
            teacherInstructions();
            int n = sc.nextInt();
            while (n < 5) {
                switch (n) {
                    case 1 -> admin.Questions();
                    case 2 -> System.out.println("ADVANCED model section is yet to be added");
                    case 3 -> admin.Review();
                    case 4 -> System.out.println("ADVANCED model REVIEW section is yet to be added");
                }
                teacherInstructions();
                n = sc.nextInt();
            }
        }

        else System.out.println("PLEASE COME BACK AGAIN WITH CORRECT CREDENTIALS");
        System.out.println("THANK YOU :)");
    }

    public static int login(){
        System.out.println("""
        Select Type:
        1. Teacher
        2. Student
        """);
        int type=sc.nextInt();
        sc.nextLine();
        DataSource d = new DataSource();
        if(verification(d)==1) System.out.println("You've logged in successfully.");
        else type=100;
        return type;
    }

    public static void studentInstructions(){
        System.out.println("""
        
        Select your Option
        1 -> MAINS model
        2 -> ADVANCED model
        3 -> REVIEW (MAINS)
        4 -> REVIEW (ADVANCED)
        5 -> YOUR ANSWERS
        6 -> SUBMIT
        """);
    }

    public static void teacherInstructions(){
        System.out.println("""
        
        Select your Option
        1 -> MAINS model
        2 -> ADVANCED model
        3 -> CHANGE KEY (MAINS)
        4 -> CHANGE KEY (ADVANCED)
        5 -> EXIT
        """);
    }

    public static int verification(DataSource d) {
        int ss=0;
        System.out.println("Enter your USERNAME:");
        String userName = sc.nextLine();
        if (d.query(userName)) {
            System.out.println("Welcome "+userName+"\n");
            System.out.println("Enter PASSCODE:");
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
        }
        else System.out.println("INVALID USER");
        return ss;
    }




}

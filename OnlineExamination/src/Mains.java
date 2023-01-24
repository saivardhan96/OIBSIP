import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Mains {

     protected ArrayList<Character> ch=new ArrayList<>();
     protected ArrayList<String> choi=new ArrayList<>();
     private int marks=12;


    public Mains(){
        Character[] chh = {'+', '*','/'};
        this.ch.addAll(Arrays.asList(chh));
    }

    public void Questions() {
        System.out.println("   MAINS model EXAMINATION");
        for (int i = 0; i < this.ch.size(); i++) {
            System.out.printf("""
                        %d: What is 2%c3 ?

                        A) 6
                        B) 2
                        C) 69
                        D) 5
                        """,i+1, this.ch.get(i));
            System.out.println("ANSWER:");
            String choice = Main.sc.next();
            Main.choices.add(choice);
            this.choi.add(choice);
        }

    }

        public void Review(){
            if(this.choi.isEmpty()) System.out.println("This is your FIRST ATTEMPT");
            else {
                System.out.println("   MAINS model EXAMINATION");
                System.out.println("        ###REVIEW###");
                for (int i = 0; i < this.ch.size(); i++) {
                    System.out.printf("""
                            %d: What is 2%c3 ?
                                    
                            A) 6
                            B) 2
                            C) 69
                            D) 5
                            Previous Answer: %s
                            """, i + 1, this.ch.get(i), this.choi.get(i));
                    System.out.print("REVIEWED ANSWER:");
                    //if(i==0) Main.sc.next();
                    String choice = Main.sc.next();
                    Main.choices.add(choice);
                    this.choi.add(choice);
                }
                System.out.println(Main.choices);
            }
        }
        public void Evaluate(){
        if(Main.choices.isEmpty()) marks=0;
        else {
            for (int i = 0; i < this.ch.size(); i++) {
                if (!Objects.equals(Main.choices.get(i), Main.Answers.get(i))) marks -= 5;
            }
        }
            System.out.println("YOUR FINAL MARKS ARE: "+marks);
        }

}












/*
    public void Questions() {
        System.out.println("   MAINS model EXAMINATION");
        for (int i = 0; i < this.ch.size(); i++) {
            System.out.printf("""
                        %d: What is 2%c3 ?

                        A) 6
                        B) 2
                        C) 69
                        D) 5
                        """,i+1, this.ch.get(i));
            System.out.println("ANSWER:");
            String choice = Main.sc.next();
            Main.choices.add(choice);
            this.choi.add(choice);
        }
    }


*/










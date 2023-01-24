public class Admin extends Mains {
    public Admin(){
        System.out.println("\n##### TEACHER PORTAL #####\n");
        System.out.println("Please be cautious while preparing/Changing key");
    }
    @Override
    public void Review() {
        System.out.println("###  KEY REVIEW  ###");
        for (int i = 0; i < super.ch.size(); i++) {
            System.out.printf("""
                        %d: What is 2%c3 ?
                                
                        A) 6
                        B) 2
                        C) 69
                        D) 5
                        Previous Key: %s
                        """,i+1, this.ch.get(i),Main.Answers.get(i));
            System.out.print("REVIEWED KEY:");
            String choice = Main.sc.next();
            Main.Answers.set(i,choice);
        }
        System.out.println("\n FINAL ANSWER KEY: "+Main.Answers);
    }

    @Override
    public void Questions() {
        super.choi.clear();
        super.Questions();
        Main.Answers.clear();
        Main.Answers.addAll(super.choi);
        System.out.println("Answer Key: "+Main.Answers);
        System.out.println("""
               Thank You for Preparing the key.
                
               NOTE: yoy can change the key by selecting OPTION-3.
                """);

    }
}

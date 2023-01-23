public class Deposit {
    private int money;
    public Deposit(){
        System.out.println("Enter money to Deposit");
        money = Main.sc.nextInt();
        System.out.println("Money deposited successfully");
        Main.balance+=this.money;
        Main.th.add("Rupees "+this.money+" Deposited");
        showBalance();

    }

    private void showBalance(){
        System.out.printf("After Depositing %d, Your account balance is %d\n",this.money,Main.balance);
    }
}

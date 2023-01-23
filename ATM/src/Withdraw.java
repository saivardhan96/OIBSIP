public class Withdraw {
    private int money=0;
    public Withdraw(){
        System.out.println("Enter money to withdraw");
        money = Main.sc.nextInt();
        if(Main.balance>=this.money){
            System.out.println("Money withdraw successful");
            Main.balance-=this.money;
            Main.th.add("Rupees "+this.money+" Debited");
            showBalance();
        }
        else {
            Main.th.add("Withdraw of rupees "+this.money+" failed");
            System.out.println("Money withdraw Not successful due to insufficient funds");
        }

    }
    private void showBalance(){
        System.out.printf("After Withdrawing %d, %d left in your account\n",this.money,Main.balance);
    }
}

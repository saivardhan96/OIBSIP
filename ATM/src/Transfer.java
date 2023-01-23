public class Transfer {
    private final int money;
    public Transfer(){
        System.out.println("Enter money to transfer");
        this.money = Main.sc.nextInt();
        if(Main.balance>=this.money) {
            Main.balance -= this.money;
            Main.th.add("Rupees "+this.money + " Transferred");
            showBalance();
        }
        else {
            System.out.println("Transferring unsuccessful due to insufficient funds.");
            Main.th.add("Transfer of rupees "+this.money+" failed");
        }
    }
    private void showBalance(){
        System.out.printf("After Transferring %d, %d left in your account\n",this.money,Main.balance);
    }
}

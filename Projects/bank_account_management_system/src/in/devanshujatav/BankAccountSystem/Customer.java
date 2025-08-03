package in.devanshujatav.BankAccountSystem;

public class Customer {
    public static void main(String[] args) {
        BankAccount act = new BankAccount("52341", "devanshu jatav");
        System.out.println("Balance After Deposited : ");
        act.depositeMoney(5000);
        act.displayBalance();

        System.out.println();

        System.out.println("Balance After Withdrawal : ");
        act.withdrawMoney(2000);
//        act.displayBalance();
    }
}
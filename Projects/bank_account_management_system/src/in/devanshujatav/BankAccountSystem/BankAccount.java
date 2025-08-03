package in.devanshujatav.BankAccountSystem;

public class BankAccount {
    private String accountNumber;
    private String accountHandler;
    private double balance;

    public BankAccount(String accountNumber , String accountHandler){
        this.accountNumber = accountNumber;
        this.accountHandler = accountHandler;
    }

    public void depositeMoney(int money){
        if (money <= 0){
            System.out.println("Invalid Amount!!!!!.....Please enter a valid amount");
        }else{
            this.balance += money;
        }
    }

    public void withdrawMoney(double money){
        if (money <= 0){
            System.out.println("Invalid Withdrawal!!!!!");
        }else if (balance >= money){
            this.balance -= money;
        }else{
            money = balance;
            this.balance = 0;
        }

        System.out.println("Remaining Balance : " + this.balance);
    }

    public void displayBalance(){
        System.out.println("Total Balance : "+ this.balance);
    }
}

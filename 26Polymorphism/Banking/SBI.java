package Banking;

public class SBI extends Bank {
    int accountNumber;
    int interestRate;
    String accountHolderName;
    int balance;


    public void OpenAccount(int amount, int accountNumber, String accountHolderName){
        super.OpenAccount(amount);
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = amount;
        System.out.println("SBI Account opened with Account Number: " + accountNumber + " and Account Holder Name: " + accountHolderName);
    }

    public void Deposit(int amount){
        super.Deposit(amount);
        balance += amount;
        System.out.println("SBI Account: Deposited: " + amount + ", Current Balance: " + balance);
    }

    public void Withdraw(int amount){
        super.Withdraw(amount);
        balance -= amount;
        System.out.println("SBI Account: Withdrawn: " + amount + ", Current Balance: " + balance);
    }

}

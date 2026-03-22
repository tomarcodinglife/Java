package Banking;

public class Bank implements Method {
    int openingBalance;
    int currentBalance;

    @Override
    public void OpenAccount(int amount){
        
        openingBalance = amount;
        currentBalance = amount;
        System.out.println("Account opened with balance: " + openingBalance);
    }

    @Override
    public void Deposit(int amount){
        currentBalance += amount;
        System.out.println("Deposited: " + amount + ", Current Balance: " + currentBalance);
    }

    @Override
    public void Withdraw(int amount){
        if(amount > currentBalance){
            System.out.println("Insufficient Balance. \n Current Balance is" + currentBalance);
        } else {
            currentBalance -= amount;
            System.out.println("Withdrawn");
        }
    }
    
    @Override
    public void CheckBalance(){
        System.out.println("Current Balance: " + currentBalance);
    }
    
}
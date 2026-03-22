package Banking;

public class Account extends SBI {
    
    // constructor
    public Account(int amount, int accountNumber, String accountHolderName){
        super.OpenAccount(amount, accountNumber, accountHolderName);
    }

    public static void main(String[] args) {
        Account SBI001 = new Account(1000, 12345, "Sujit Tomar");

        SBI001.Deposit(500);

        SBI001.Withdraw(200);
        
        SBI001.CheckBalance();
    }

    


}
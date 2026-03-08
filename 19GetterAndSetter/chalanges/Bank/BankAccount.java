package Bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;


    public BankAccount(String accountNumber, String accountHolderName, double accountOpeningBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = accountOpeningBalance;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Account Holder Name : ").append(accountHolderName).append("\n");
        str.append("Account Number : ").append(accountNumber).append("\n");
        str.append("Current Balance : ").append(String.format("%.2f", balance)).append("\n");

        return str.toString();
    }

    public void depositMoney(double money){
        if(money <= 0 ){
            System.out.println("Invalid Deposit");
        }else{
            balance += money;
        }
    }

    public double withdrawMoney(double money){
        if(balance >= money){
            balance -= money;
        }else if(money <= 0){
             System.out.println("Invalid Withdraw");
        }else{
            money = balance;
            balance = 0;
            System.out.printf("You withdraw %.2f", money);
            System.out.println();
        }

        return money;
    }
    

}

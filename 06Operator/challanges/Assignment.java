import java.lang.*;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        int accountBalance = 1000;

        Scanner input = new Scanner(System.in);
        System.out.println("your Current Balance is " + accountBalance);
        
        // Assignment Operator (=, +=, -=, *=, /=, %=)
        // Its also called shorthand operator (+=, -=, *=, /=, %=)

        System.out.print("Enter Deposite = ");
        int Deposite = input.nextInt();
        accountBalance += Deposite;
        System.out.println("accountBalance += Deposite : " + accountBalance);
        
        System.out.print("Enter Withdrawal = ");
        int Withdrawal = input.nextInt();
        accountBalance -= Withdrawal;
        System.out.println("accountBalance += Withdrawal : " + accountBalance );

        System.out.println("Current Balance : " + accountBalance);

    }
}
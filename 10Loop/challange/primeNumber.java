import java.util.Scanner;

public class primeNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker Method");
        System.out.println("Please Enter the Number : ");
        int num = input.nextInt();

        System.out.println("Your Number is " + 
            (isPrime(num) ? "Prime" : " Not Prime")
        );
    }

    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }

        for(int i = 2; i <= num; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

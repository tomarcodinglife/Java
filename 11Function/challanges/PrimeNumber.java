import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Prime Number Checking");
        System.out.print("Enter Number : ");
        int MyNum = input.nextInt();
        PrimeNumCheck(MyNum);
    }

    public static void PrimeNumCheck(int Num){
        if (Num <= 1) {
            System.out.println("Not Prime Number");
            return;
        }

        int i = 2;
        boolean isPrime = true;

        while (i <= Num / 2) {
            if (Num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime) {
            System.out.print("This is Prime Number");
            
        }else{
            System.out.println("This is NOT Prime Number");
        }

    }

}
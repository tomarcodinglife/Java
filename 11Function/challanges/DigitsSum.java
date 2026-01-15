package challanges;

import java.util.Scanner;

public class DigitsSum {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Factorials");
        System.out.print("Please Enter Your Number : ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.print("Sum of Digit is" + sum);
    }   

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            System.out.println("num % 10" + "=" + (num % 10));
            System.out.println(num % 10 + "=" + sum);
            num = num / 10;
            System.out.println("um = num / 10" + "=" + (num = num / 10));
            System.out.println((num = num / 10) + "=" + num);
        }
        return sum;
    }
}

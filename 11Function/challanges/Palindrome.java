package challanges;

import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number Checker");
        System.out.print("Enter Number : ");
        int userInput = input.nextInt();

        int result = reverse(userInput);

        if (result == userInput) {
            System.out.print("This is Palindrome Number");
        }else{
            System.out.print("This is Not Palindrome Number");
        }

    }


    public static int reverse(int num){
        int reverseResult = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reverseResult = reverseResult * 10 + lastDigit ;
            num = num / 10 ;
        }

        return reverseResult;
    }


}

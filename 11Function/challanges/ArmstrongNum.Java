package challanges;

import java.util.Scanner;


public class ArmstrongNum{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Check Armstrong Cheacker");
        System.out.print("Enter Number : ");
        int UserInput = input.nextInt();
        int result = 0;

        while(UserInput > 0)
            int digit = UserInput
            result = result + 



    }

    public static int DigitsCount(int Num) {
        int count = 0;
        while(Num > 0) {
            count++;
            Num = Num / 10;
        }
        return count;
    }
}
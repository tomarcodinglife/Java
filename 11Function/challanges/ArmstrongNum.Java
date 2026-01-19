package challanges;

import java.util.Scanner;


public class ArmstrongNum{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Check Armstrong Cheacker\n");
        System.out.print("Enter Number : ");
        int UserInput = input.nextInt();
        input.close();
        
        int digits = DigitsCount(UserInput);
        int ActualNum =  UserInput;
        int result = 0;

        while(UserInput > 0) {
            int digit = UserInput % 10;
            result = result  + power(digit, digits);
            UserInput = UserInput / 10;
        }

        if(result == ActualNum){
            System.out.print("Armstrong Number");
        }else{
            System.out.print("Not an Armsstrong Number");
        }
    }

    public static int DigitsCount(int Num) {
        int count = 0;
        while(Num > 0) {
            count++;
            Num = Num / 10;
        }
        return count;
    }

    public static int power(int num, int power){
        int result = 1;
        while(power > 0){
            result = result * num;
            power--;
        }
        return result;
    }
}
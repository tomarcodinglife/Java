package challanges;
import java.util.Scanner;

public class ReturnOpposite{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Return Opposite Number Game");
        System.out.print("Enter Own Number: ");
        int UserNumber = input.nextInt();
        int Result = ReturnNumber(UserNumber);
        System.out.print("Your Opposite Number is" + Result);
    }

    public static int ReturnNumber (int num){
        int reverseNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num = num / 10;
        }

        return reverseNum;
    }

}
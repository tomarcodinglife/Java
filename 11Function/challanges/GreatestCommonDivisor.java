package challanges;
import java.util.Scanner;

public class GreatestCommonDivisor{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welsome to Find Greatest Common Divisor");
        System.out.print("Enter First Number : ");
        int fNum = input.nextInt();
        System.out.print("Enter Second Number : ");
        int sNum = input.nextInt();

        int result = Gnum(fNum, sNum);
        System.out.print(result);
        
    }

    public static int Gnum(int fNum, int sNum ){
        int smallNum = (fNum > sNum) ? sNum : fNum;
        int i = 1;
        int gcd = 1;
        while (i <= smallNum) {
            if (fNum % i == 0 && sNum%i ==0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
}
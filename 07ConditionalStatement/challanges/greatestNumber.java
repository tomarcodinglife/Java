import java.util.Scanner;

public class greatestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double firstNum = input.nextDouble();
        System.out.print("Enter Second Number : ");
        double secondNum = input.nextDouble();
        System.out.print("Enter Third Number: ");
        double thirdNum = input.nextDouble();

        if (firstNum >= secondNum && firstNum >= thirdNum) {
            System.out.println("First Number Largest : " + firstNum);
        }else if (secondNum >= thirdNum && secondNum >= firstNum) {
            System.out.println("Second Number Largest : " + secondNum);
        }else if (thirdNum >= firstNum && thirdNum >= secondNum) {
            System.out.println("Third Number Largest : " + thirdNum);
        }

    }

}
import java.util.Scanner;

public class Airthmetic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number = ");
        int firstNumber = input.nextInt();
        System.out.print("Enter Second Number = ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int devideResult = firstNumber / secondNumber ;
        int modulus = firstNumber % secondNumber;
        
        System.out.println(sum);
        System.out.println(substraction);
        System.out.println(multiplication);
        System.out.println(devideResult);
        System.out.println(modulus);

    }

}
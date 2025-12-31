import java.util.Scanner;

public class compoundInt {

    public static void main(String[] args) {
        System.out.println("Welcome to Compund Interest Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double principalAmount = input.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        double rateOfInterest = input.nextDouble();
        System.out.print("Enter Time Duration in Year : ");
        double timeDuration = input.nextDouble();
        double CompundInt = principalAmount * (1 + rateOfInterest / 100) * timeDuration; 
        System.out.print("Result : " + CompundInt);

    }
}
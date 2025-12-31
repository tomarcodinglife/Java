import java.util.Scanner;

public class compoundInt {

    public static void main(String[] args) {
        System.out.println("Welcome to Compund Interest Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        int principalAmount = input.nextInt();
        System.out.print("Enter Rate of Interest : ");
        float rateOfInterest = input.nextFloat();
        System.out.print("Enter Time Duration in Year : ");
        float timeDuration = input.nextFloat();

        double CompundInt = principalAmount * Math.pow((1 + rateOfInterest / 100), timeDuration); 

        System.out.print("Result : " + CompundInt);

    }
}
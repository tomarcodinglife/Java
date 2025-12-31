import java.util.Scanner;

public class SimpleInt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle : ");
        double principle = input.nextDouble();
        System.out.println("Enter Time : ");
        double time = input.nextDouble();
        System.out.println("Enter Interest : ");
        double Interest = input.nextDouble();
        double result = (principle * time * Interest) / 100 ; 
        System.out.println("Result : " + (result));

    }

}
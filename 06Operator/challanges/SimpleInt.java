import java.util.Scanner;

public class SimpleInt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle : ");
        double principle = input.nextInt();
        System.out.println("Enter Time : ");
        double time = input.nextInt();
        System.out.println("Enter Interest : ");
        double Interest = input.nextInt();
        
        System.out.println("Result : " + (principle * time * Interest));

    }

}
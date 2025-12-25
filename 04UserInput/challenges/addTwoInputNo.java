import java.util.Scanner;

public class addTwoInputNo {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number A : ");
        int numA = input.nextInt();
        System.out.println("NumA is " + numA);
        System.out.print("Enter Number B : ");
        int numB = input.nextInt();
        System.out.println("NumB is " + numB);
        System.out.print(numA + numB);

    }
}
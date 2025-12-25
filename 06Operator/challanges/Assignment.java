import java.lang.*;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter NumA = ");
        int NumA = input.nextInt();
        

        System.out.print("Enter NumB = ");
        int NumB = input.nextInt();

        // Assignment Operator (=)
        int temp = NumA;

        NumA = NumB;
        NumB = temp;

        System.out.println(" After swap NumA =  " + NumA);
        System.out.println(" After swap NumB =  " + NumB);

    }
}
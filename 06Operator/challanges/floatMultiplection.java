import java.util.Scanner;

public class floatMultiplection {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Numer 01 : ");
        double NumA = input.nextFloat();
        System.out.print("Enter Number 02 : ");
        double NumB = input.nextFloat();

        double mul = NumA * NumB;
        System.out.print(mul);

    }

}
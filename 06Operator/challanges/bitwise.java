import java.util.Scanner;

public class bitwise {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int FirstNumber = input.nextInt();
        System.out.print("Enter Second Number : ");
        int SecondNumber = input.nextInt();

        int ANDOperator = FirstNumber & SecondNumber;
        int OROperator = FirstNumber | SecondNumber;
        int XOROperator = FirstNumber ^ SecondNumber;
        int NOTOperator = ~FirstNumber;
        int LeftShiftOperator = FirstNumber << SecondNumber;
        int RightShiftOperator = FirstNumber >> SecondNumber;

        System.out.println("AND Operator : " + ANDOperator);
        System.out.println("OR Operator : " + OROperator);
        System.out.println("XOR Operator : " + XOROperator);
        System.out.println("NOT Operator : " + NOTOperator);
        System.out.println("Left Shift Operator : " + LeftShiftOperator);
        System.out.println("ARight Shift Operator : " + RightShiftOperator);

    }


}
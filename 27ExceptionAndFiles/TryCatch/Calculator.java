package TryCatch;

import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to DIvision Calculator");

        System.out.println("Please Enter your two Numbers : ");

        System.out.print("Enter First Number : ");
        int first = input.nextInt();
        System.out.print("Enter Second Number : ");
        int second = input.nextInt();


        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        } catch (ArithmeticException e) {
            System.out.printf(" %S, Divide by Zero, Enter Valid Value", e.getMessage());
        }

        






    }


}
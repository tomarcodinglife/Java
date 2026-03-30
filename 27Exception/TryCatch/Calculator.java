package TryCatch;

import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");


        try {
            System.out.print("Enter First Number : ");
            int first = input.nextInt();

            System.out.print("Enter Second Number : ");
            int second = input.nextInt();

            int result = first / second;
            System.out.println("Result is " +  result);
            

        } catch (ArithmeticException e) {
            System.out.printf(" %S, Divide by Zero, Enter Valid Value", e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid Input");
            
        } finally{
            System.out.println("Calculator Closed");
        }

        

        






    }


}
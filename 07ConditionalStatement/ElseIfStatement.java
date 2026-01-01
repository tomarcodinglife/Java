import java.util.Scanner;

public class ElseIfStatement {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Tomar Calculator");
        System.out.print("What's Your Name : ");
        String UserName = input.nextLine();
        System.out.print("Type of Calcuting (Add/Subtract/Count/Devide) : ");
        String Caltype = input.nextLine();

        if (Caltype.equalsIgnoreCase("Add")) {
            System.out.println("Welcome to Add Calculator " + UserName);
            System.out.print("Enter First Number : ");
            double firstNumber = input.nextDouble();
            System.out.print("Enter Second Number : ");
            double secondNumber = input.nextDouble();

            System.out.print("Total : " + (firstNumber + secondNumber));

        }else if(Caltype.equalsIgnoreCase("Subtract")) {

            System.out.println("Welcome to Subtract Calculator " + UserName);
            System.out.print("Enter First Number : ");
            double firstNumber = input.nextDouble();
            System.out.print("Enter Second Number : ");
            double secondNumber = input.nextDouble();

            System.out.print("Total : " + (firstNumber - secondNumber));

        }else if(Caltype.equalsIgnoreCase("Count")) {
            System.out.println("Welcome to Count Calculator " + UserName);
            System.out.print("Enter First Number : ");
            double firstNumber = input.nextDouble();
            System.out.print("Enter Second Number : ");
            double secondNumber = input.nextDouble();

            System.out.print("Total : " + (firstNumber * secondNumber));

        }else if (Caltype.equalsIgnoreCase("Devide")) {
            System.out.println("Welcome to Devide Calculator " + UserName);
            System.out.print("Enter First Number : ");
            double firstNumber = input.nextDouble();
            System.out.print("Enter Second Number : ");
            double secondNumber = input.nextDouble();

            System.out.print("Total : " + (firstNumber / secondNumber));
        }else {
            System.out.print("Please Enter Correct Answer");
        }





    }
     
}
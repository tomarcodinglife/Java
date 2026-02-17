import java.util.Scanner;

public class recursion {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial Generator");
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        long result = factorialMethod(num);
        System.out.println("the Factorial is " + result);


        long myResult = factorialThroughLoop(num);
        System.out.print("The Factorial is by loop " + myResult);
    }

    // Recursion
    public static long factorialMethod(int num){
        if(num == 1){
            return 1;
        }
        return num * factorialMethod(num-1);
    }

    public static long factorialThroughLoop(int num){
        int result = 1;
        for(int i = 1; i <= num ; i++){
            result *= i;
        }
        return result;
    }





}
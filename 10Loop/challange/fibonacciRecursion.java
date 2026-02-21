import java.util.Scanner;

public class fibonacciRecursion{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to fibonacci print using recursion method");
        System.out.print("Enter the Number : ");

        int fibonacciNumber = input.nextInt();

        for(int i = 1; i <= fibonacciNumber; i++){
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci (int num){
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fibonacci(num-1) + fibonacci(num-2); // Resursion
    }
}
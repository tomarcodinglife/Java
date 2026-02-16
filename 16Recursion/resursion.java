import java.util.Scanner;

public class resursion {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial Generator");
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        long result = 
    }

    public static long factorialMethod(int num){
        if(num == 1){
            return 1;
        }
        return num * factorialMethod(num-1);
    }





}
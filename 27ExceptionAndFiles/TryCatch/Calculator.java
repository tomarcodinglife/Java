package TryCatch

import java.util.Scanner;

public class calculator{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to DIvision Calculator");

        System.out.println("Please Enter your two Numbers : ");

        int first = input.nextInt();
        int second = input.nextInt();

        int result = first / second;

        System.out.printf("Result is %d", result);

        

    }


}
import java.util.Scanner;

public class minimumNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find minimum Number of given number");
        System.out.println("Enter First Number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second Number : ");
        int num2 = input.nextInt();

        // using ternary operator
        int minimumNumber = num1 < num2 ? num1 : num2;
        System.out.println("Your Minimum Number is " +  minimumNumber);

        // Calling Static Method
        int minNum = minimumNum(num1, num2);
        System.out.println("Static Method Min Num : " + minNum);

        // Calling Non Static Method
        minimumNumber objectMinNum = new minimumNumber();
        int myMin = objectMinNum.minNumber(num1, num2);
        System.out.println("Without Static Method Min Value is " + myMin);

    }

    public static int minimumNum(int num1, int num2){
        int minNum = num1 < num2 ? num1 : num2;
        // System.out.println("Min Number is : " + minNum);
        return minNum;
    }

    public int minNumber(int num1, int num2){
        int minNum = num1 < num2 ? num1 : num2;
        return minNum;
    }

}

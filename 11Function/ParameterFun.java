import java.util.Scanner;

public class ParameterFun {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    System.out.print("Enter First Number: ");
    int first = InputFun();

    System.out.print("Enter Second Number : ");
    int second = InputFun();

    int result = sum(first, second);
    System.out.println("Total is : " + result);

    }

    public static int InputFun() {
        return input.nextInt();
    }

    public static int sum(int first, int second){
        int sum = first + second;
        return sum;
    }
}
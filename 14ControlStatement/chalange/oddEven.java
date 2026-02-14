import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd or Even Check Method");
        System.out.println("Enter The Number : ");

        int num = input.nextInt();

        String result = num % 2 == 0 ? "Even" : "Odd";

        System.out.println("Your Number is " + result);

    }
}

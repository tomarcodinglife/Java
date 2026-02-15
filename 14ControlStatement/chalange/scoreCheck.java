import java.util.Scanner;

public class scoreCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Score Check Method");
        System.out.println("Enter the own marks: ");

        int num = input.nextInt();

        if (num < 80) {
            System.out.println("High");
        }else if (num > 50 && num < 80) {
            System.out.println("Moderate");
        }else if (num < 50) {
            System.out.println("Low");
        }else{
            System.out.println("Invilid");
        }

    }
}

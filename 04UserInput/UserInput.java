import java.util.Scanner;

public class UserInput {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name : ");
        String userName = input.nextLine();
        System.out.println(" Hi " + userName);
        System.out.print("Enter own age" + userName + ":" );
        int age = input.nextInt();
        System.out.println(" Hello " + userName + " Your Age is " + age);
    }

}
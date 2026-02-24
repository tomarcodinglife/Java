import java.util.Scanner;

public class inputStringUppercase {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to input and return uppercase method");
        System.out.println("Enter own frist String : ");

        String userInput1 = input.nextLine();
        StringBuffer result = new StringBuffer("Your First String is ").append(userInput1.toUpperCase()).append("\n");


        System.out.println("Enter own Second String: ");
        String userInput2 = input.nextLine();
        result.append("And your second String is ").append(userInput2.toUpperCase()).append("\n");

        System.out.println(result);

    }
}

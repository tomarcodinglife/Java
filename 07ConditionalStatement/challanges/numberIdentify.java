import java.util.Scanner;

public class numberIdentify {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        double number = input.nextInt();

        if(number == 0) {
            System.out.println("It is Zero");
        }else if(number > 0) {
            System.out.println("Number is positive");
        }else if (number < 0) {
            System.out.println("Number is Negative");
        }else{
            System.out.println("Wrong Input");
        }

        if (number%2 == 0) {
            System.out.println("It is Even Number");
        }else if (number%2 != 0) {
            System.out.println("It is Odd Number");
        }else {
            System.out.println("odd even not working on your input");
        }


    }

}
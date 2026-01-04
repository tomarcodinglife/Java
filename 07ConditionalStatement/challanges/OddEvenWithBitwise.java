import java.util.Scanner;

public class OddEvenWithBitwise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = input.nextInt();

        if ((number & 1) == 1) {
            System.out.println("Number is Odd");
        }else{
            System.out.println("Number is Even");
        }

    }

}

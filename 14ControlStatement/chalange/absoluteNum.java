import java.util.Scanner;

public class absoluteNum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welsome to Absolute Number Maker ");
        System.out.println("Enter the number : ");

        int num = input.nextInt();

        // absolute return
        int Result = (num >= 0) ? (num): (-num);
        System.out.println("Absolute Number is : " + Result);

    }

}
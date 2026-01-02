import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int Year = input.nextInt();

        if (((Year % 4) == 0 ) && ((Year % 100 != 0) || ((Year % 400) == 0))) {
           System.out.println("It is Leap Year");
        }else {
            System.out.println("It is Not Leap Year");
        }

    }

}
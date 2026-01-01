import java.util.Scanner;

public class Relational {

    public static void main(String[]  args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter own Number : ");
        int num = input.nextInt();
        int myNum = 100;
        
        System.out.println("num == myNum");
        System.out.println(num == myNum);

        System.out.println("num =! myNum");
        System.out.println(num != myNum);

        System.out.println("num > myNum");
        System.out.println(num > myNum);
        
        System.out.println("num < myNum");
        System.out.println(num < myNum);

        System.out.println("num >= myNum");
        System.out.println(num >= myNum);

        System.out.println("num <= myNum");
        System.out.println(num <= myNum);

    }

}
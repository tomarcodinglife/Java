import java.util.Scanner;

public class ReturnFunction {

    public static void main(String[] args) {

        message();
        int FNum = InputNumber();
        int SNum = InputNumber();
        int sum = FNum + SNum;
        System.out.print("Sum of the Numbers : " + sum);

    }

    public static int InputNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int Num = input.nextInt();
        return Num;
    }


    public static void message() {
         System.out.println("Welcome to Calculator");
    }

}
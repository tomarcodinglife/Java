import java.util.Scanner;

public class deleteFromArray {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Array Deletion \n");
        int[] numArray = arrayInputUtility.inputArray();
        System.out.print("Enter own Num for Deletion : ");
        int deletedNum = input.nextInt();

        int[] AfterDeletionArray = deletedNumArray(numArray, deletedNum);

        System.out.println("Below is your New Array");

    }

    public static int [] deletedNumArray (int[]Array, int Num){
        int[] NewArray = ;

        return NewArray;
    }

}

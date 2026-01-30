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

        DisplayArray(AfterDeletionArray);
    }

    public static int [] deletedNumArray (int[]Array, int Num){
        // Step 1 (count same value)
        int count = 0;
        int i = 0;
        while (i < Array.length) {
            if (Array[i] == Num) {
                count ++;
            }
            i++;
        }

        if (count ==0) {
            return Array;
        }

        // Step 2 (New Array Declare)
        int[] NewArray = new int[Array.length - count];

        // Step 3 (Array index value assign)

        int index = 0;
        int NewArrayindex = 0;

        while (index < Array.length) {
            if (Array[index] != Num) {
                NewArray[NewArrayindex] = Array[index];
                NewArrayindex++;
            }
            index++;
        }
        return NewArray;
    }

    public static void DisplayArray(int[] Array){
        int i = 0;
        while (i < Array.length) {
            System.out.print(Array[i] + " ");
            i++;
        }
        System.out.println();
    }

}

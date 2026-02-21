import java.util.Scanner;

public class sumAllPositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to only positive number enter");

        System.out.print("Enter the Length : ");
        int arrayLength = input.nextInt();
        int[] myArray = new int[arrayLength];

        int index = 0;
        while (index < myArray.length) {
            System.out.print("Enter the " + (index + 1) + " Number Value : ");
            int value = input.nextInt();
            if (value < 0) {
                myArray[index] = value;
                index++;
                // continue;
            }else{
                myArray[index] = value;
                index++;
            }
        }

        int total = 0;
        for(int num : myArray){
            if (num > 0) {
                total += num;
            }
        }

        System.out.println("Total of All Positive Number is " + total);

    }
    

    
}

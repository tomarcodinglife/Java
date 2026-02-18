import java.util.Scanner;

public class maxValueInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Welcome to array searching");
        System.out.print("Enter the arrayLength    : ");
        int arrayLength = input.nextInt();

        int[] myArray = new int [arrayLength];

        
        for(int i=0; i< myArray.length; i++){
            System.out.print("Enter the " + (i + 1) + " Number Value : ");
            myArray[i] = input.nextInt();
        }

        // 
        int maxValue = myArray[0];

        for(int i =0; i < myArray.length; i++){
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            }
        }

        System.out.print("Max Number is " + maxValue);

    }


}

import java.util.Scanner;

public class occurrencesInArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to No. Searching in Array How Many Times Available");
        System.out.println("Enter the Array Length : ");
        int arrayLength = input.nextInt();

        int[] myArray = new int [arrayLength];

        int index = 0;
        while (index < myArray.length) {
            System.out.print("Enter the " + (index + 1) + "Index Value : ");
            int value = input.nextInt();
            myArray[index] = value;
            index++;
        }

        // Number Search
        System.out.println("Enter the number to Search : ");
        int searchNumber = input.nextInt();


        // using for each loop occurrences
        int count = 0;
        for(int num : myArray){
            if (num == searchNumber) {
                count++;
            }
        }

        System.out.println("Number " + searchNumber + " occurs " + count + " times ");

    }


}
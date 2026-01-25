import java.util.Scanner;

public class numberOccurrences{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number Occurrences");
        System.out.print("Enter Number : ");
        int userInput = input.nextInt();

        int[] arrayNew = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int result = count(arrayNew, userInput);

        if (result == 0) {
            System.out.print("No match from my array list");
        }else{
            System.out.println("Array Matched & "+ result + " times from my array" );
        }
        input.close();
    }
    
    public static int count (int[] myArray, int num){
        int count = 0;
        int i = 0;

        while (i < myArray.length) {
            if (num == myArray[i]) {
                count ++;
            }
            i++;
        }
        return count;
    }
}
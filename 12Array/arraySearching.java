import java.util.Scanner;

public class arraySearching{

    public static void main(String[] args) {
        int[] myArray = {12, 36, 96, 15, 85, 40, 18, 45, 36, 22, 10, 174, 18, 45, 45, 63};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Own Number : ");
        int UserInput = input.nextInt();
        
        boolean found =  arraySearch(myArray, UserInput);
        if (found) {
            arrayMatchQuantity(myArray, UserInput);
        }
    }

    public static boolean arraySearch(int[] array, int num){
        int i = 0;
        while (i < array.length) {
            if (array[i] == num) {
                System.out.println("Your Input is already available in array");
                return true;
            }
            i++;
        }
        System.out.println("Your Input is not available in array");
        return false;
    }




    public static int arrayMatchQuantity(int[] array, int num){
        int i = 0;
        int count = 0;
        while (i < array.length) {
            if (array[i] == num) {
                count++;
            }
            i++;
        }
        System.out.println("Your Input is "+  count +" Times in array");
        return count;
    }


}

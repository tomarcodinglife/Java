
import java.util.Scanner;

class arrayInputUtility{

    public static int[] inputArray() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number the No of Element : ");
        int arraySize = input.nextInt();
        
        int[] nums = new int[arraySize];

        int i = 0;
        while (i < arraySize) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
}
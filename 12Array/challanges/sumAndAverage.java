package challanges;

import java.util.Scanner;

public class sumAndAverage {
    
    public static void main(String[] args){
        
        System.out.print("Sum and Average");
        int[] myInputArray = arrayInputUtility.inputArray();
        
        long total = sum(myInputArray);
        double avg = average(myInputArray);

        if (myInputArray.length == 0) {
            System.out.println("Its Invailed Array");
        }else{
            System.out.println(total);
            System.out.println(avg);
        }
    }

    public static long sum (int[] numsArray){
        long sum = 0;
        int i = 0;

        while (i < numsArray.length) {
            sum += numsArray[i];
            i++;
        }
        return sum;
    }

    public static double average (int[] numsArray){
        long sum = sum(numsArray);
        double average = (double) (sum / numsArray.length);
        return average;
    }
    
}

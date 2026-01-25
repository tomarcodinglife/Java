package challanges;

public class MaxAndMinNumber {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Max and Min Number Finder");
        int[] InputArray = arrayInputUtility.inputArray();
        
        if (InputArray.length == 0) {
            System.out.println("Its Invailed Array");
        }else{
            int MaxNum = max(InputArray);
            int MinNum = min(InputArray);
            System.out.println("MaxNum = " + MaxNum);
            System.out.println("MinNum = " + MinNum);
        }
    }

    public static int min (int[] myArray){
        int min = myArray[0] ;
        int i = 0;

        while (i < myArray.length) {
            if (myArray[i] < min ) {
                min = myArray[i];
            }
            i++;
        }
        return min;
    }


    public static int max (int[] myArray) {
        int max = myArray[0];
        int i = 1;
        while (i < myArray.length) {

            if (myArray[i] > max) {
                max = myArray[i];
            }
            i++;
        }
        return max;
    }
}

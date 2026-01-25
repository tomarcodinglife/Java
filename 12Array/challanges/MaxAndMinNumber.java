package challanges;

public class MaxAndMinNumber {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Max and Min Number Finder");
        int[] inputArray = arrayInputUtility.inputArray();
        
        int MaxNum = max(inputArray);
        int MinNum = 
    }

    public static int min (int[] myArray){
        int min ;
        int i = 0;

        while (i < myArray.length) {
            if (myArray[i] > 0 && ) {
                
            }
            i++;
        }
        
        return min;
    }


    public static int max (int[] myArray) {
        int max = 0;
        int i = 0;
        while (i < myArray.length) {

            if (myArray[i] > max) {
                max = myArray[i];
            }
            i++;
        }
        return max;
    }
}

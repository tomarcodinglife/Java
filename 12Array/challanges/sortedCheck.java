package challanges;

public class sortedCheck {
    
    public static void main(String[] args) {
        System.out.println("Welcome to check your array sorted or Not");
        int[] inputArray = arrayInputUtility.inputArray();

        boolean isInc = IncreasingOrder(inputArray);
        boolean isDec = DecreasingOrder(inputArray);

        if(isDec || isInc){
            System.out.println("Array Sorted");
        }else{
            System.out.println("Array Not Sorted");
        }

    }

    public static boolean IncreasingOrder(int[] myArray){
        if (myArray.length <= 1) {
            return true;
        }else{
            int i = 1;
            while (i < myArray.length) {
                if (myArray[i] < myArray[i - 1]) {
                    return false;
                }
                i++;
            }
        }
        
        return true;
    }

    public static boolean DecreasingOrder(int[] myArray){
        if (myArray.length <= 1) {
            return true;
        }else{
            int i = 1;
            while (i < myArray.length) {
                if (myArray[i] > myArray[i-1]) {
                    return false;
                }
                return false;
            }
        }
        return true;
    }
}

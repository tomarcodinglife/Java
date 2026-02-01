import java.lang.reflect.Array;

public class mergeTwoSortedArray{

    public static void main (String[] args) {
        System.out.println("Welcome to Merge Two Sorted Array");

        int[] Array1 = arrayInputUtility.inputArray();
        int[] Array2 = arrayInputUtility.inputArray();
        
        int[] result = mergeArray(Array1, Array2);       
        
        displayArr(result);

    }

    public static int[] mergeArray(int[]Array1, int[] Array2){
        int[] NewArray = new int[Array1.length + Array2.length];

        int i = 0, j=0, k=0;

        while (i < Array1.length && j < Array2.length) {
            if (Array1[i] <= Array2[j]) {
                NewArray[k] = Array1[i];
                i++;
            }else{
                NewArray[k] = Array2[j];
                j++;
            }
            k++;
        }

        while (i < Array1.length) {
            NewArray[k] = Array1[i];
            i++;
            k++;
        }

        while (j < Array2.length) {
            NewArray[k] = Array2[j];
            j++;
            k++;
        }
        return NewArray;
    }

    public static void displayArr(int[] Array){
        int i = 0;

        while (i < Array.length) {
            System.out.print(Array[i] + " ");
            i++;
        }
    }

}

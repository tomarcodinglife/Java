public class ReverseArray {
    
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse an Array Method");
        int[] MainArray = arrayInputUtility.inputArray();

        int[] Result1 = ReverseArrayMethod1(MainArray.clone());
        int[] Result2 = ReverseArrayMethod2(MainArray.clone());
        int[] Result3 = ReverseArrayMethod3(MainArray.clone());

        System.out.print("Method 1 : ");
        DisplayArray(Result1);
        System.out.print("Method 2 : ");
        DisplayArray(Result2);
        System.out.print("Method 3 : ");
        DisplayArray(Result3);
    }

    public static int[] ReverseArrayMethod1 (int[] Array){
        int[] NewArray = new int[Array.length];
        int i = 0;
        int j = Array.length-1;
        while (i < Array.length) {
            NewArray[j] = Array[i];
            j--;
            i++;
        }
        return NewArray;
    }

    public static int[] ReverseArrayMethod2(int[] Array){
        int i = 0;
        int j = Array.length-1;
        while (i < j) {
            int temp = Array[i];
            Array[i] = Array[j];
            Array[j] = temp;
                
            i++;
            j--;
        }
        return Array;
    }

    public static int[] ReverseArrayMethod3(int[] Array){
        int i = 0;
        
        while (i < Array.length / 2) {
            int  swap = Array[i];
            Array[i] = Array[(Array.length -1)-i];
            Array[(Array.length -1)-i] = swap;
            i++;
        }
        return Array;
    }

    public static void DisplayArray(int[] Array) {
        int i = 0;

        while (i < Array.length) {
            System.out.print(Array[i] + " ");
            i++;
        }
        System.out.println();
    }

}

import java.util.Scanner;

public class palindrome{

    public static void main(String[] args){
        int[] myArray = inputArray();
        
        boolean isPalindrome1 = palindromeMethod1(myArray);

        if (isPalindrome1) {
            System.out.println("Yes this is Palindrome");
        }else{
            System.out.println("This is Not Palindrome");
        }
        
    }

    public static int[] inputArray(){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number of Element : ");
        int arraySize = input.nextInt();
        int[] nums = new int[arraySize];
        int i = 0;
        while (i < arraySize) {
            System.out.print("Enter No. of Element : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static boolean palindromeMethod1(int[] Array){

        int i = 0;
        int j = Array.length-1;

        while (i < j) {
            if (Array[i] != Array[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean palindromeMethod2(int[] Array){
        int i = 0; 
        while (i < Array.length/2) {
            if (Array[i] != Array[Array.length-1-i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
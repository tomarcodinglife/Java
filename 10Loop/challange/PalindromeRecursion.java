import java.util.Scanner;

public class PalindromeRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Recursion Module");
        String userNumber = input.nextLine();



    }
    
    public static boolean isPalindrome(String userString){

        if (userString.length() <= 1) {
            return true;
        }

        int lastPosition = userString.length()-1;
        if (userString.charAt(0) != userString.charAt(lastPosition)) {
            return false;
        }

        String newString = userString.substring(1, lastPosition);
        return isPalindrome(newString);

    }

}
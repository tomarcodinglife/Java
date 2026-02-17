import java.util.Scanner;

public class guessNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to gussing Number Games");
        System.out.println("Enter the own Number : ");
        int userNumber = input.nextInt();
        System.out.println("Enter the index Number : ");
        int userIndexNum = input.nextInt();

        boolean myResult = randomNumber(userIndexNum, userNumber);
        if (myResult) {
            System.out.println("Your guessing Number is right");
        }else{
            System.out.println("Your guessing Number is wrong");
        }

    }

    public static boolean randomNumber(int index, int UserNum){
        boolean result = false;
        int[] myArray = {5, 6, 8, 6, 3, 2, 7, 9, 11};

        if (myArray[index] == UserNum) {
            result = true;
        }

        return result;
    }

}
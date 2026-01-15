import java.util.Scanner;

public class FibonacciSeries{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Series Print");
        System.out.print("Enter Your End Number : ");
        int UserNum = input.nextInt();

        fibobacciPrinter(UserNum);

    }

    public static void fibobacciPrinter(int num){
        int previousNum = 0;
        int currectNum = 1;
        System.out.print(previousNum + " ");
        System.out.print(currectNum + " ");
        while (currectNum <= num) {
            int nextNum = previousNum + currectNum; 

                if (nextNum > num) {
                    break;
                }

            System.out.print(nextNum + " ");
            previousNum = currectNum;
            currectNum = nextNum;
        }
    }

}
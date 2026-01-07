package challanges;

import java.util.Scanner;

public class factorialsNum {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Factorials Num : ");
        int fNum = Input.nextInt();
        long result = factorials(fNum);
        System.out.println(result);
    }

    public static long factorials(int n){
        int i = 1;
        int sum = 1;
        while (i <= n) {
            sum *= i;
            i++;
        }
        return sum;
    }
}

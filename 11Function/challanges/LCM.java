package challanges;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM Calculator");
        System.out.println("Enter First Number : ");
        int fNum = input.nextInt();
        System.out.println("Enter Second Number: ");
        int sNum = input.nextInt();
        int result = LCMResult(fNum, sNum);
        System.out.println("LCM of given two number is : " + result);
    }

    public static int LCMResult(int fNum, int sNum) {
        int maxNum = (fNum > sNum) ? fNum : sNum;

        while (true) {
            if ((maxNum % fNum == 0) && (maxNum % sNum == 0)) {
                return maxNum;
            }
            maxNum++;
        }
    }
}
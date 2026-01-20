package challanges;

import java.util.Scanner;

public class patternPrint {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Print Pattern");
        System.out.print("Enter how much row print pattern: ");
        int userRow = input.nextInt();

        rightHalfPyramid(userRow);
        reverseRightHalfPyramid(userRow);
        leftHalfPyramid(userRow);
    }

    public static void rightHalfPyramid(int row){
        int i = 0;

        while (i < row) {
            int j = 0;
            
           while (j <= i) {
                System.out.print("* ");
                j++;
           }
           System.out.println();
           i++;
        }

    }

    public static void reverseRightHalfPyramid(int row){
        int i = 0;
        
        while (i < row) {
           int starCounter = 0;

           while (starCounter < (row - i) ) {
                System.out.print("* ");
                starCounter++;
           }
           System.out.println();

           i++;

        }


    }

    public static void leftHalfPyramid(int row){
        int i = 0;
        while (i < row) {

            int space = 0;
            while (space <= i) {
                System.out.print(" ");
                space++;
            }


            int star = 0;

            while (star <= i) {
                System.out.print("* ");
                star++;
            }


        }


    }

}

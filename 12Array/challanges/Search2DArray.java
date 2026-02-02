import java.util.Scanner;

class Search2DArray{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welsome to Find Num in 2D Array Method");

        int[][] numArray =  inputArray2D();

        System.out.print("Enter the number which is you want to search: ");
        int num = input.nextInt();

        boolean result = NumSearch(numArray, num);
        if (result) {
            System.out.print("Your Number is Found in 2D Array");
        }else{
            System.out.print("Your Number is Not Found in 2D Array");
        }

    }

    public static int[][] inputArray2D(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number of Rows: ");
        int rows = input.nextInt();
        System.out.print("Please Enter Number of Column: ");
        int column = input.nextInt();

        int[][] numArray = new int[rows][column];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < column) {
                System.out.print("Please Enter element row: " + (i+1) + ", column " + (j+1) + " : ");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

    public static boolean NumSearch(int[][] Array, int UserNum){
        int i = 0;
        while (i < Array.length) {

            int j = 0;
            while (j <Array[i].length) {
                if (Array[i][j] == UserNum) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
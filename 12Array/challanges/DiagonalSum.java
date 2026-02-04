import java.util.Scanner;

class DiagonalSum{
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of Diagonal Array Sum Method");
        int[][] myArray = input2DArray();
        int resultSum = DiagonalSum(myArray);
        System.out.println("Diagonal Sum = " + resultSum);
    }

    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No of Row: ");
        int rows = input.nextInt();
        System.out.println("Enter No of Column: ");
        int columns = input.nextInt();

        int[][] MyDiagonalArray = new int[rows][columns];
        int row = 0;
        while (row < rows) {
                int column = 0;
                while (column < columns) {
                    System.out.print("Enter Row" + (row + 1) + " " + "Column " + (column+1) + ":");
                    MyDiagonalArray[row][column] = input.nextInt();
                    column++;
                }
            row++;
        }
        return MyDiagonalArray;
    }

    public static int DiagonalSum(int[][] myArray){
        int LeftDiagonalSum = 0;
        int RightDiagonalsum = 0;
        int row = 0;
        int column = 0;
        int arrayLength = myArray.length;
        if (arrayLength != myArray[0].length) {
            System.out.println("Diagonal Sum Not Possible");
            return 0; 
        }
        while (row < arrayLength) {
            LeftDiagonalSum += myArray[row][column];
            RightDiagonalsum += myArray[row][(arrayLength -1)-column];
            row++;
            column++;
        }
        int totalSum = LeftDiagonalSum + RightDiagonalsum;
        if (arrayLength % 2 != 0) {
            int centerValue = arrayLength / 2;
            totalSum -= myArray[centerValue][centerValue];
        }
        return totalSum;
    }

}
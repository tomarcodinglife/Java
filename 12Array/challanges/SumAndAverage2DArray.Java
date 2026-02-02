
class SumAndAverage2DArray{

    public static void main(String[] args){
        int[][] my2DArray = inputArray2D();


    }


    public static int[][] inputArray2D(){

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to 2D Array Maker Method");
        System.out.print("Enter Row: ");
        int Rows = input.nextInt();
        System.out.print("ENter Column : ");
        int Columns = input.nextInt();
        
        int[][] NewArray = new int[Rows][Columns];

        int Row = 0;
        while(Row < Rows){
            int Column = 0;
            while(Column < Columns){
                System.out.print("Enter Row" + (Row + 1) + " Column " + (Column + 1) + ": ");
                NewArray[Row][Column] = input.nextInt();
                Column++;
            }
            Row++;
        }
        return NewArray;
    }

    public static long sum(int[][] my2DArray){
        long sum = 0;

        int Rowindex = 0;
        while(Rowindex < my2DArray.length){

            int ColumnIndex = 0;
            while(ColumnIndex < my2DArray[Rowindex].length){
                sum = sum + my2DArray[Rowindex][ColumnIndex];
                ColumnIndex++;
            }
            Rowindex++;
        }

        return sum;
    }

    public static double Average(int[][] my2DArray){
        long sum = 0;
        int count = 0;

        int row = 0;
        while(row < my2DArray.length){
            int column = 0;
            while(column < my2DArray[row].length){
                sum += my2DArray[row][column]
                count++;
                column++;
            }
            row++;
        }
        
        double average = sum / count;
        return average;
    }


}
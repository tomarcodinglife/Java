
public class multidimensionalArray{

    public static void main(String[] args){

        int[][] marksArray = new int[2][6];
        int[][] myArray = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};

        marksArray[0][0] = 35;
        marksArray[0][1] = 48;
        marksArray[0][2] = 68;
        marksArray[0][3] = 85;
        marksArray[0][4] = 53;
        marksArray[0][5] = 78;
        marksArray[1][0] = 89;
        marksArray[1][0] = 45;
        marksArray[1][0] = 60;
        marksArray[1][0] = 89;
        marksArray[1][0] = 45;
        marksArray[1][0] = 20;

        System.out.print(marksArray[0][1]);  // 48
        System.out.println();
        multidimensionalTraversal(myArray);

        // in Hetrogenious Array collumn and row array not equal
    }

    public static void multidimensionalTraversal(int[][] array){
        int i = 0;
        while (i < array.length) {
            int j = 0;
            while (j < array[i].length) {
                System.out.print(array[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
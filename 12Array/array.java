
public class array{

    public static void main(String[] args) {

        int[] MainArray = new int[6];
        MainArray[0] = 5;
        MainArray[1] = 8;
        MainArray[2] = 13;
        MainArray[5] = 11;
        MainArray[4] = 9;
        MainArray[3] = 7;

        int[] myArray  = {5, 10, 25};

        int index = 3;        
        System.out.println("MainArray[5]" + MainArray[5]);
        System.out.println("MainArray["+ index +"]" + MainArray[index]);



        arrayTraversal(myArray);

    }


    public static void arrayTraversal(int[] array){
        int i = 0;

        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }
}
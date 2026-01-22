
public class array{

    public static void main(String[] args) {

        int[] MainArray = new int[6];
        MainArray[0] = 5;
        MainArray[1] = 8;
        MainArray[2] = 13;
        MainArray[5] = 11;
        MainArray[4] = 9;
        MainArray[3] = 7;

        String[] strArr = new String[5];
        strArr[0] = "Rahul";
        strArr[2]= "Ranjit";
        strArr[3] = "Amrit";
        strArr[1] = "Rohan";
        strArr[4] = "Satyam";

        int[] myArray  = {5, 10, 25};
        String[] arrayString = {"Amit", "Sumit", "Sohan"};

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
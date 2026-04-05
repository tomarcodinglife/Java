import java.util.*;



public class Frequency {

    public static void main(String[] args) {

        List <Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        System.out.println(Collections.frequency(myList, 1)); // Output: 2
        System.out.println(Collections.frequency(myList, 2)); // Output: 2
        System.out.println(Collections.frequency(myList, 3)); // Output: 2
        System.out.println(Collections.frequency(myList, 4)); // Output: 2
        System.out.println(Collections.frequency(myList, 5)); // Output: 2
        


    }


}
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to String Modules & Methods");
        System.out.println("Enter the User Input :  ");

        String userString = input.nextLine(); // Sujit

        System.out.println(userString.length()); // 5
        System.out.println(userString.charAt(0)); // S
        System.out.println(userString.equals("Sujit")); // ture
        System.out.println(userString.equalsIgnoreCase("sujit")); // true
        System.out.println(userString.contains("Su")); // true
        System.out.println(userString.substring(1, 3)); // uj - i not mention because last index not include
        System.out.println(userString.indexOf("S")); // 0
        System.out.println(userString.replace("Su", "A")); // Ajit
        System.out.println(userString.toUpperCase()); // SUJIT
        System.out.println(userString.toLowerCase()); // sujit


        // -----------------------------------------------------


        String name = "           Sujit ";
        System.out.println(name.trim()); // Sujit - remove extra space

        // ---------------------------------------------------------------
        String[] arr = userString.split(" ");
        System.out.println(arr);

        for(String word : arr){
            System.out.println(word); // Sujit
        } 


        System.out.println(Arrays.toString(arr)); // [Sujit]
        
        /*

        Feature	        String	                StringBuffer	    StringBuilder
        Mutable	         No	                      Yes	                Yes
        Storage         String Constent pool     heap                  heap
        Thread Safe	     Yes	                  Yes	               No
        Speed	        Slow	                 Medium	                Fast

        */

    }

}

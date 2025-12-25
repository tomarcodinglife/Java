import java.lang.*;
import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {

        //  implicit conversion
        float floatNumber = 5; 
        double doubleNumber = 3.1f;
        long longNumber = 7;

        // explicit or Casting
        float floatNum = (float) 5.0; 
        double doubleNum = (double)5.0;
        long longNum = (long) 5.0 ;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(longNumber);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(longNum);


        
        
    }
}
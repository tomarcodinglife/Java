package oddnumber;
import java.util.List;


public class OddNumber {

    public static void main(String[] args) {


        // Print odd numbers normally
        List <Integer> oddNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Odd numbers from 1 to 10:");

        for (int number : oddNumbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
         }

        // Print odd numbers using Stream API and Lambda Expression
        System.out.println("\n Odd numbers using Stream API and Lambda Expression:");
        oddNumbers.stream()
                  .filter(number -> number % 2 != 0)
                  .forEach(number -> System.out.println(number));
        
        


    }
    
}
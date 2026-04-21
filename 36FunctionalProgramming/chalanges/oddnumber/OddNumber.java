package oddnumber;
import java.util.List;


public class OddNumber {

    public static void main(String[] args) {


        // Print odd numbers normally
        List <Integer> Numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Odd numbers from 1 to 10:");

        for (int number : Numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
         }

        // Print odd numbers using Stream API and Lambda Expression
        System.out.println("\n Odd numbers using Stream API and Lambda Expression:");
        Numbers.stream()
                  .filter(number -> number % 2 != 0)
                  .forEach(number -> System.out.println(number));

        // Print Max number from the list of odd numbers
        System.out.println("\n Max number from the list of odd numbers:");
        int maxNumber = Numbers.stream()
                                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(maxNumber);

        // Print Max Odd number from the list of odd numbers
        System.out.println("\n Max Odd number from the list of odd numbers:");
        int maxOddNumber = Numbers.stream()
                                    .filter(number -> number % 2 != 0)
                                    .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(maxOddNumber);



    }
    
}
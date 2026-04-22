
import java.util.HashMap;
import java.util.List;
import java.util.function.*;
import java.util.Map;
import java.util.HashMap;

public class MethodRefrences {

    public static void main(String[] args) {
        List <Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List <String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        Map <String, Integer> myMap = new HashMap<>();
           

        numbers.stream()
                .filter(num -> num % 2 != 0 )
                .forEach(num -> System.out.println(num));

        // Using method reference to print odd numbers
        System.out.println("\n Using method reference to print odd numbers:");
        numbers.stream()
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println); // double colon (::)

        


        



    }
    
}

package filterStringConcatenate;
import java.util.List;


public class FilterStringConcat {

    public static void main(String[] args) {
        List <String> names = List.of("Amit", "Ankit", "Suresh", "Ramesh", "Suresh", "Amit");

        // String Filter and Concatenate
        System.out.println("Concatenated names that start with 'S':");
        String concatenate = names.stream()
                                  .filter(name -> name.length() > 5 || name.length() == 5)
                                  .reduce("", (a, b) -> a + " " + b);

        System.out.println("Concatenated names : " + concatenate);

    }

    
}

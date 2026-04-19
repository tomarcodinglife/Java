import java.util.List;

public class StringIntoStream {


    public static void main(String[] args) {

        List<String> names = List.of("Amit", "Ankit", "Suresh", "Ramesh", "Suresh", "Amit");
        
        // Convert List of Strings into Stream and print each name
        System.out.println("Names in the list:");
        names.stream()
             .forEach(name -> System.out.println(name));


        // Filter names that start with 'A' and print them
        System.out.println("Names that start with 'A':");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(name -> System.out.println(name));


        // Remove duplicates and print unique names
        System.out.println("Unique names:");
        names.stream()
             .distinct()
             .forEach(name -> System.out.println(name));


        // Convert names to uppercase and print them
        System.out.println("Names in uppercase:");
        names.stream()
             .map(name -> name.toUpperCase())
             .forEach(name -> System.out.println(name));


        // Concatenate all names into a single string and print it
        System.out.println("Concatenated names:");
        String concatenatedNames = names.stream()
                                        .reduce("", (a, b) -> a + b);   
        System.out.println("Concatenated names: " + concatenatedNames);


        // Filter Lenth greater than 5 and print them
        System.out.println("Names with length greater than 5:");
        names.stream()
             .filter(name -> name.length() > 5)
             .forEach(name -> System.out.println(name));

             
        // String Filter and Concatenate
        System.out.println("Concatenated names that start with 'S':");
        String concatenatedSNames = names.stream()
                                        .filter(name -> name.startsWith("S"))
                                        .reduce("", (a, b) -> a + b);
        System.out.println("Concatenated names that start with 'S': " + concatenatedSNames);


    }
    
}
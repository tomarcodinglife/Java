package Chalanges;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {

    public static String userInput() {
        System.out.println("Please enter a string to find unique characters:"); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        return input;
    }


    public static void main(String[] args) {
        
        Set <Character> uniqueChars = new HashSet<>();
        String inputString = userInput();

        for (char c : inputString.toCharArray()) {
            uniqueChars.add(c);
            System.out.println("Adding character: " + c + " to the set of unique characters.");
        }

        System.out.println("Unique characters in the string: " + uniqueChars);
        System.out.println("Total unique characters: " + uniqueChars.size());


    }

    
}

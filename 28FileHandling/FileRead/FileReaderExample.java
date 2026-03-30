package FileRead;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {

        System.out.println("Welcome to File Handling in Java! Let's explore how to read and write files.");
        String FileName = "example.txt";

        try(FileReader reader = new FileReader(FileName)) { // Using try-with-resources to ensure the FileReader is closed automatically
            
            int character; // Variable to hold the integer value of the character read from the file

            System.out.println("Contents of the file " + FileName + ":");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Cast the integer to a character and print it
            }

            System.out.println("\nFile reading successful!");

        }catch(IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }



    }
        

    
}

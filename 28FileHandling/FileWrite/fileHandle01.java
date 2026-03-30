package FileWrite;

import java.io.FileWriter;
import java.io.IOException;

public class fileHandle01 {
    
    public static void main(String[] args) {

        String fileName = "example.txt";

        System.out.println("Welcome to File Handling in Java! Let's explore how to read and write files.");

        try(FileWriter writer = new FileWriter(fileName)) { // Using try-with-resources to ensure the FileWriter is closed automatically
            
            writer.write("My Name is Sujit Tomar.\n");
            writer.write("I am learning Java File Handling.\n");
            writer.write("This is an example of writing to a file using FileWriter.\n");
        
            writer.flush(); // Ensure all data is written to the file   

            System.out.println("File writing successful! Data has been written to " + fileName);

        }catch(IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }


    }

}

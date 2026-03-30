package Chalanges;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecondChalanges {

    public static void main(String[] args) {
        System.out.println("Welcome to the Second Chalanges! Solve the problems and learn from them.");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the File Name : ");
        String fileName = input.nextLine();

        System.out.print("Enter the content to write to the file : ");
        String content = input.nextLine();
        
        try(FileWriter writer = new FileWriter(fileName)){  
            writer.write(content);
            System.out.println("File Writing Sucessful");
        }catch(IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        input.close();
    }


    
}

package Chalanges;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FirstChalanges {
    public static void main(String[] args) {
        System.out.println("Welcome to the First Chalanges! Solve the problems and learn from them.");

        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();

        try(FileReader reader = new FileReader(fileName)){
            int character;

            System.out.println("Contents of the file " + fileName + ":");

            while((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

        }catch(FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: The file " + fileName + " was not found.");

        }catch(Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    

    }

}

import java.util.Scanner;

public class NameInput {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Name : ");
        String userName = input.nextLine();
        System.out.print("Welcome " + userName + " to Coding with Tomar");

    }

}
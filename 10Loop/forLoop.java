import java.util.Scanner;

public class forLoop {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Itration with for Loop ");
        System.out.print("Enter the Array Length : ");
        int ArrayLength = input.nextInt();
        input.nextLine();

        String[] MyArray= new String[ArrayLength];

        for(int i=0; i < ArrayLength; i++){
            System.out.print("Enter the " + (i + 1) + "Number Name : ");
            MyArray[i] = input.nextLine();  
        }

        // output Check
        System.out.println("\nYou Entered : ");
        for(int i = 0; i < ArrayLength; i++){
            System.out.print(MyArray[i] + " ");
        }
        input.close();
    }

}

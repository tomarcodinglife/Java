import java.util.Scanner;

public class inputStringArray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to String Module");
        System.out.println("Enter the array length : ");
        int stringArrayLength = input.nextInt();
        input.nextLine();
        
        // Array Method
        String[] array = new String[stringArrayLength];

        // String Builder
        StringBuilder myString = new StringBuilder(" ");

        for(int i = 0; i < stringArrayLength; i++){
            System.out.println("Enter the String " + (i + 1)+ " Value : ");
            String userInput = input.nextLine();
            array[i] = userInput;
            myString.append(userInput).append(" ");
        }

        System.out.println("\nStored Array");
        for(String str : array){
            System.out.print(str + " " );
        }


        System.out.println("\nString Builder ");
        System.out.println(myString);

        input.close();

    }


}

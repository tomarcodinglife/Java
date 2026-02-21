
import java.util.Scanner;

public class exitOnExit {
    public static void main(String[] args) {
        System.out.println("Exit only on Exit Type");
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Which type Array You Want (String / Number) ? ");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Programme Terminated");
                break;
            }

            // Number Case
            if (userInput.equalsIgnoreCase("number")) {

                System.out.println("Enter Array Length : ");

                int arrayLength = Integer.parseInt(input.nextLine());

                if (arrayLength <= 0) {
                    System.out.println("Invalid Entry");
                    continue;
                }

                int[] myArray = new int[arrayLength];

                int index = 0;
                do {
                    System.out.println("Enter the " + (index + 1) + "Value : ");
                    myArray[index] = Integer.parseInt(input.nextLine());
                    index++;
                } while (index < arrayLength);

                System.out.println("Array Created Sucessfully");

                for(int val : myArray ){
                    System.out.println(val);
                }

            } else if (userInput.equalsIgnoreCase("string")) {

                System.out.println("Enter Array Length : ");
                int arrayLength = Integer.parseInt(input.nextLine());

                if (arrayLength <= 0) {
                    System.out.println("Invalid Array Length");
                    continue;
                }

                String[] myArray = new String[arrayLength];

                int index = 0;
                do {
                    System.out.println("Enter the " + (index + 1) + "Value : ");
                    myArray[index] = input.nextLine();
                    index++; 
                } while (index < myArray.length);

                System.out.println("Array Created");

                for(String val : myArray){
                    System.out.print(val + " ");
                }

            }
        }

    }
}

package Chalanges.FirstChalanges;
import java.util.*;

public class ExceptionChalanges {

    // Custom Exception 

    public static class MyCustomException extends Exception {
        public MyCustomException(String message) {
            super(message);
        }
    }

/*
    // public static int getValidInteger(Scanner scanner, String prompt) {
    //     int number;
    //     while (true) {
    //         try {
    //             System.out.println(prompt);
    //             number = scanner.nextInt();
    //             if (number < 0) {
    //                 throw new MyCustomException("Number cannot be negative.");
    //             }
    //             return number; // Return the valid number
    //         } catch (MyCustomException e) {
    //             System.out.println("myCustomException caught: " + e.getMessage());
    //             scanner.nextLine(); // Clear the invalid input
    //         } catch (InputMismatchException e) {
    //             System.out.println("InputMismatchException caught: Please enter a valid integer.");
    //             scanner.nextLine(); // Clear the invalid input
    //         } catch (Exception e) {
    //             System.out.println("An unexpected error occurred: " + e.getMessage());
    //             scanner.nextLine(); // Clear the invalid input
    //         }
    //     }
    // }
*/



    public static void main(String[] args) {

        System.out.println("Welcome to the Exception Chalanges! Handle the exceptions and learn from them.");
        Scanner scanner = new Scanner(System.in);
        int num1, num2;


        // for the first number - Exception handling for invalid input
        while (true) {
            try{
                System.out.println("Enter the First Number: ");
                num1 = scanner.nextInt();

                if (num1 < 0) {
                    // myCustomException e = new myCustomException("First number cannot be negative.");
                    // throw e;
                    throw new MyCustomException("First number cannot be negative.");

                }

                break; // Exit the loop if input is valid

            }catch (MyCustomException e) {
                System.out.println("myCustomException caught: " + e.getMessage());
                scanner.nextLine(); // Clear the invalid input

            }catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException caught: " + e.getMessage());

            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException caught: Please enter a valid integer.");
                scanner.nextLine(); // Clear the invalid input

            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                scanner.nextLine(); // Clear the invalid input

            } finally {
                // This block will always execute, even if an exception is thrown
                // You can use it to perform cleanup or logging if needed
            }
        }

        // for the second number - Exception handling for invalid input
        while (true) {
            try{
                System.out.println("Enter the Second Number: ");
                num2 = scanner.nextInt();

                if (num2 < 0) {
                    throw new MyCustomException("Second number cannot be negative.");
                }

                break; // Exit the loop if input is valid
                
            } catch (MyCustomException e) {
                System.out.println("myCustomException caught: " + e.getMessage());
                scanner.nextLine(); // Clear the invalid input

            }catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException caught: " + e.getMessage());
                scanner.nextLine(); // Clear the invalid input

            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException caught: Please enter a valid integer.");
                scanner.nextLine(); // Clear the invalid input

            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                scanner.nextLine(); // Clear the invalid input

            }finally {
                // This block will always execute, even if an exception is thrown
                // You can use it to perform cleanup or logging if needed
            }
        }


        try {
            int result = num1 / num2;
            System.out.println("The result of " + num1 + " / " + num2 + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Cannot divide by zero. Please provide a non-zero second number.");
        } catch(Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }

        
    }
    

}
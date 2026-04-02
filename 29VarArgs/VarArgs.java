

public class VarArgs {

    // Varargs (Variable Arguments) allows you to pass a variable number of arguments to a method.
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    
    // Normally, you would have to define multiple methods to handle different numbers of arguments, but with varargs, you can handle them all with a single method.
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sumArray (int [] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // Varargs with minimum one argument
    public static int sum(int first, int... numbers) {
        int total = first; // Start with the first argument
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // Varargs with two arguments
    public static int sum(int first, int second, int... numbers) {
        int total = first + second; // Start with the first two arguments
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    


    public static void main(String[] args) {

        // Using the sum method with Normal parameters
        System.out.println(sum(5, 10)); // Output: 15

        // Using the sum method with an array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sumArray(numbers)); // Output: 15

        // Using the sum method with Varargs
        System.out.println(sum(numbers));                       // Output: 15
        System.out.println(sum());                              // Output: 0

    }


    
}

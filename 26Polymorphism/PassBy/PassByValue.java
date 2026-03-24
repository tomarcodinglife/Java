package PassBy;

public class PassByValue {

    // Pass by value is a method of passing arguments to a function where the actual value is passed, rather than a reference to the value. In Java, all primitive data types (such as int, double, boolean) are passed by value. This means that when you pass a primitive
    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int result = add(a, b);
        System.out.println("The sum is: " + result); // Output: The sum is: 15



    }

    
}

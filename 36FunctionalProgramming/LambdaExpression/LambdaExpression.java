
package LambdaExpression;




public class LambdaExpression {

    // Lambda expression is an anonymous function that can be used to implement functional interfaces.
    // A functional interface is an interface that has only one abstract method.

    // Without lambda expression
    public static int add(int a, int b) {
        return a + b;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        LambdaExpression mynum = new LambdaExpression();

        // Without lambda expression
        int sum = mynum.add(5, 10);
        printMessage("Sum: " + sum);


        // With lambda expression
        

    }

}
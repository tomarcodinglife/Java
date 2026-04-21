package chalanges.lambdaexpression;
import java.util.function.*;

public class Multiplication {

    // Custom functional interfaces for three, four and five parameters
    @FunctionalInterface
    interface TriFunction<A, B, C, R> {
        R apply(A a, B b, C c);
    }

    @FunctionalInterface
    interface QuadFunction<A, B, C, D, R> {
        R apply(A a, B b, C c, D d);
    }

    @FunctionalInterface
    interface PentaFunction<A, B, C, D, E, R> {
        R apply(A a, B b, C c, D d, E e);
    }

    public static void main (String[] args) {
        // Multiplication of Two numbers using Lambda Expression

        // Two parameters and a return value
        BinaryOperator<Integer> multiplication = (a, b) -> a * b;
        System.out.println("Multiplication of 5 and 10: " + multiplication.apply(5, 10));

        // Multiplication of Three numbers using Lambda Expression
        // Three parameters and a return value
        TriFunction<Integer, Integer, Integer, Integer> multiplicationOfThree = (a, b, c) -> a * b * c;
        System.out.println("Multiplication of 5, 10 and 15: " + multiplicationOfThree.apply(5, 10, 15));

        // Multiplication of Four numbers using Lambda Expression
        // Four parameters and a return value
        QuadFunction<Integer, Integer, Integer, Integer, Integer> multiplicationOfFour = (a, b, c, d) -> a * b * c * d;
        System.out.println("Multiplication of 5, 10, 15 and 20: " + multiplicationOfFour.apply(5, 10, 15, 20));

        // Multiplication of Five numbers using Lambda Expression
        // Five parameters and a return value
        PentaFunction<Integer, Integer, Integer, Integer, Integer, Integer> multiplicationOfFive = (a, b, c, d, e) -> a * b * c * d * e;
        System.out.println("Multiplication of 5, 10, 15, 20 and 25: " + multiplicationOfFive.apply(5, 10, 15, 20, 25));

    }

    
    
}

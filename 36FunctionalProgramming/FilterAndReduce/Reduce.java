package FilterAndReduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Without reduce method

        System.out.println("Without reduce method");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        System.out.println("With reduce method");
        int sumWithReduce = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer a, Integer b) {
                        return a + b;
                    }
                });

        System.out.println("Sum with reduce method: " + sumWithReduce);


        // With reduce method and lambda expression

        System.out.println("With reduce method and lambda expression");
        int sumWithReduceAndLambda = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum with reduce method and lambda expression: " + sumWithReduceAndLambda);

        // Max value in the list using reduce method and lambda expression
        int maxWithReduceAndLambda = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("Max value with reduce method and lambda expression: " + maxWithReduceAndLambda);

        // Min value in the list using reduce method and lambda expression
        int minWithReduceAndLambda = numbers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.println("Min value with reduce method and lambda expression: " + minWithReduceAndLambda);
        
    }



}
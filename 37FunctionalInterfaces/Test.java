
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.BinaryOperator;
import java.lang.Runnable;
import java.lang.Comparable;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public class Test {
    

    public static void main(String[] args) {
        
        // Predicate Interface
        // A predicate is a functional interface that takes one argument and returns a boolean value.
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Consumer Interface
        // A consumer is a functional interface that takes one argument and returns no result.
        Consumer<String> printMessage = message -> System.out.println(message);
        printMessage.accept("Hello, World!");

        //BinaryOperator Interface
        // A binary operator is a functional interface that takes two arguments of the same type and returns
        // a result of the same type.
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Sum of 5 and 10: " + add.apply(5, 10));

        //Functional Interface
        // A functional interface is an interface that has only one abstract method. It can have multiple
        // default and static methods.
        // Example of a functional interface
        @FunctionalInterface
        interface MyFunctionalInterface {
            void myMethod();
        }

        //Runnable is a functional interface that has only one abstract method run()
        Runnable myRunnable = () -> System.out.println("Running in a thread");
        Thread thread = new Thread(myRunnable);
        thread.start();

        //Comparable is a functional interface that has only one abstract method compareTo()
        Comparable<Integer> myComparable = (a, b) -> a.compareTo(b);
        System.out.println("Comparing 5 and 10: " + myComparable.compareTo(5, 10));

        // Action Listener is a functional interface that has only one abstract method actionPerformed()
        // Example of ActionListener
        // ActionListener myActionListener = e -> System.out.println("Button clicked");

        
        // Supplier is a functional interface that has only one abstract method get()
        // Example of Supplier
        Supplier<String> mySupplier = () -> "Hello, World!";
        System.out.println("Supplier result: " + mySupplier.get());

        // BiConsumer is a functional interface that takes two arguments and returns no result.
        // Example of BiConsumer
        // BiConsumer<String, Integer> myBiConsumer = (name, age) -> System.out.println(name + " is " + age + " years old");
        // myBiConsumer.accept("Alice", 30); 
        
        // BiFunction is a functional interface that takes two arguments and returns a result.
        // Example of BiFunction
        // BiFunction<Integer, Integer, Integer> myBiFunction = (a, b) -> a + b;
        // System.out.println("BiFunction result: " + myBiFunction.apply(5, 10));

        //UnaryOperator is a functional interface that takes one argument and returns a result of the same type.
        // Example of UnaryOperator
        UnaryOperator<Integer> myUnaryOperator = a -> a * a;
        System.out.println("UnaryOperator result: " + myUnaryOperator.apply(5));






    }

}

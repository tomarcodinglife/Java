

public class Wrapper {
    
    public static void main(String[] args) {

        // This is an example of using wrapper classes in Java. Wrapper classes are used to convert primitive data types into objects. This process is called autoboxing, and the reverse process is called unboxing.


        // What is different between primitive data types and wrapper classes?
        // Primitive data types are the basic data types in Java, such as int, double, char, etc. They are not objects and do not have methods. Wrapper classes, on the other hand, are classes that encapsulate a primitive data type and provide methods to manipulate the data. For example, Integer is a wrapper class for int, and Double is a wrapper class for double.

        // Primitive Data Types:
        int a = 10;
        double b = 3.14;

        // Wrapper Classes:
        Integer num1 = 10; // Autoboxing: int to Integer
        Double num2 = 3.14; // Autoboxing: double to Double
        System.out.println("Integer value: " + num1); // Output: Integer value: 10
        System.out.println("Double value: " + num2); // Output: Double value:

        System.out.println("Integer value using intValue(): " + num1.intValue()); // Output: Integer value using intValue(): 10
        System.out.println("Double value using doubleValue(): " + num2.doubleValue()); //

        // Wraper Class isliye use hota hai kyunki primitive data types ke paas methods nahi hote, jabki wrapper classes ke paas methods hote hain jo unke corresponding primitive data types ko manipulate karne mein madad karte hain. For example, Integer class has methods like intValue(), parseInt(), etc., which can be used to convert a String to an int or to get the int value from an Integer object.

    





    }



}

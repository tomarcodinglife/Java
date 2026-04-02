

public class Unboxing {

    public static void main(String[] args) {
        
        // Wrapper Class me premitive data types ko objects me convert karne ko autoboxing kehte hain, aur objects ko primitive data types me convert karne ko unboxing kehte hain. Unboxing ka use tab hota hai jab aapko wrapper class ke object se primitive value chahiye hoti hai.

        // Unboxing Example:
        Integer num1 = 10; // Autoboxing: int to Integer
        int a = num1; // Unboxing: Integer to int
        System.out.println("Unboxed value: " + a); // Output: Unboxed value

        // Type Checking with Unboxing:
        Integer num2 = 20; // Autoboxing: int to Integer
        if (num1 < num2) { // Unboxing happens here to compare the values
            System.out.println(num1 + " is less than " + num2); // Output: 10 is less than 20
        } else {
            System.out.println(num1 + " is not less than " + num2);
        } 
        



    }

    
}

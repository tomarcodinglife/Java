package Nested;

public class Outer {
    int x = 10;         // instance variable of outer class
    static int y = 20; // static variable of outer class

    // non-static inner class 
    /** if you create non-static inner class then inner class associated with the instance of outer class and you can create object of inner class only through the object of outer class */

    class Inner {
        // instance variable of inner class
        private int z = 30;


        void display() {
            System.out.println("Value of x: " + x); // ✔ can access instance variable of outer class
            System.out.println("Value of y: " + y); // ✔ can access static variable of outer class
        }
    }

    // static nested class
    /* if you create static nested class then inner class is not associated with the instance of outer class and you can create object of static nested class without creating object of outer class */
    
    static class StaticNested {
        void display() {
            // System.out.println("Value of x: " + x); // ❌ cannot access instance variable of outer class
            System.out.println("Value of y: " + y); // ✔ can access static variable of outer class
        }
    }


}

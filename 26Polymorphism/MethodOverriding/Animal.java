package MethodOverriding;

public class Animal {
    
    public void display() {
        System.out.println("This is the display method of the parent class.");
    }


    // Method Overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
    public void bark() {
        System.out.println("The animal is barking.");
    }


}

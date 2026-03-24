package MethodOverriding;

public class Dog extends Animal {

    /* Method Overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. */
    @Override
    public void display() {
        System.out.println("This is the display method of the child class.");
    }

    // Method Overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
    @Override
    public void bark() {
        System.out.println("The dog is barking.");
    }

}

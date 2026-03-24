package ConstructorOverriding;

public class Animal {
    // constructor overriding is not possible in Java because constructors are not inherited by subclasses. However, a subclass can call the constructor of its superclass using the super() keyword, but it cannot override it.
    // constructor overriding is a feature that allows a subclass to provide a specific implementation of a constructor that is already defined in its superclass.
    public Animal() {
        System.out.println("This is the constructor of the animal class.");
    }

    // Method Overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
    public void bark () {
        System.out.println("The animal is barking.");
    }



}

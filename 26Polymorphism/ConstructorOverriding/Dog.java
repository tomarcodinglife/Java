package ConstructorOverriding;

public class Dog extends Animal {

    /* Constructor Overriding is a feature that allows a subclass to provide a specific implementation of a constructor that is already defined in its superclass. */
    public Dog() {
        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("This is the constructor of the child class.");
    }

    // Constructor Overriding is a feature that allows a subclass to provide a specific implementation of a constructor that is already defined in its superclass.
    public Dog (String name) {
        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("This is the constructor of the child class with a parameter: " + name);
    }

    /// Method Overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
    public void bark() {
        System.out.println("The dog is barking.");
    }

    

    
}

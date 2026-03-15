package Animal;

/* It is abstract class because we cannot create an object of it and it may contain abstract methods that must be implemented by subclasses.*/

public abstract class Animal {
    private int age;
    private String name;
    private int noOfLegs;


    // Abstract Methods
    public abstract void runAnimal();

    // Constructor
    public Animal(String name, int age, int noOfLegs) {
        this.name = name;
        this.age = age;
        this.noOfLegs = noOfLegs;
        System.out.println("Creating an animal named: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number of legs: " + noOfLegs);  
    }

    void move(String AnimalsMovesType) {
        System.out.println("The " + AnimalsMovesType + " moves.");
    }

    void makeSound(String AnimalsSound) {
        System.out.println("The " + AnimalsSound + " makes a sound.");
    }

    void eat(String AnimalsEatsItem) {
        System.out.println("The " + AnimalsEatsItem + " eats food.");
    }

    void sleep(String AnimalsSleep, int hours) {
        System.out.println("The " + AnimalsSleep + " sleeps for " + hours + " hours.");
    }

    // Getters and setters for the properties
    public int getAge() {
        return age;
    }   

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }



}
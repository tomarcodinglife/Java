package Animal;

public class Test {

        public static void main (String[] args){

            // Polymorphism: Upcasting
            Animal animal1 = new Dog(); // Upcasting: Dog is an Animal
            Animal animal2 = new Cat(); // Upcasting: Cat is an Animal

            animal1.eat(); // Output: Dog is eating (runtime polymorphism)
            animal1.sleep(); // Output: Dog is sleeping (runtime polymorphism)

            // Polymorphism: Downcasting
            Dog dog1 = (Dog) animal1;  // Downcasting: Animal is a Dog
            dog1.eat(); // Output: Dog is eating
            dog1.sleep(); // Output: Dog is sleeping

            // Safe downcasting with instanceof
            if (animal2 instanceof Cat) {
                Cat cat1 = (Cat) animal2; // Downcasting: Animal is a Cat
                cat1.eat(); // Output: Cat is eating
                cat1.sleep(); // Output: Cat is sleeping
            } else {
                System.out.println("animal2 is not a Cat");
            }

            System.out.println("--- Testing Polymorphism with test method ---");

            test(animal1); // Output depends on the actual type of animal (Dog)
            test(animal2); // Output depends on the actual type of animal (Cat)



        }


    

    public static void test(Animal animal) {
        animal.eat(); // Output depends on the actual type of animal (Dog or Cat)
        animal.sleep(); // Output depends on the actual type of animal (Dog or Cat)
        animal.makeSound(); // Output depends on the actual type of animal (Dog or Cat)

        // Polymorphism: instanceof operator
        if (animal instanceof Dog) {
            System.out.println("This is a Dog");
        } else if (animal instanceof Cat) {
            System.out.println("This is a Cat");
        } else {
            System.out.println("This is an unknown Animal");
        }
    }


}
package Animal;

public class Test {

        public static void main (String[] args){
        
            // Create instances of Animal, Dog, and Cat
            Animal animal = new Animal();
            Dog dog = new Dog();
            Cat cat = new Cat();

            animal.eat(); // Output: Animal is eating
            animal.sleep(); // Output: Animal is sleeping
            animal.makeSound(); // Output: Animal is making a sound


            dog.eat(); // Output: Dog is eating
            dog.sleep(); // Output: Dog is sleeping
            dog.makeSound(); // Output: Dog is barking


            cat.eat(); // Output: Cat is eating
            cat.sleep(); // Output: Cat is sleeping
            cat.makeSound(); // Output: Cat is meowing


            // Polymorphism: Upcasting
            Animal animal1 = new Dog(); // Upcasting: Dog is an Animal
            Animal animal2 = new Cat(); // Upcasting: Cat is an Animal

            animal1.eat(); // Output: Dog is eating (runtime polymorphism)
            animal1.sleep(); // Output: Dog is sleeping (runtime polymorphism)
            animal1.makeSound(); // Output: Dog is barking (runtime polymorphism)
            animal2.eat(); // Output: Cat is eating (runtime polymorphism)
            animal2.sleep(); // Output: Cat is sleeping (runtime polymorphism)
            animal2.makeSound(); // Output: Cat is meowing (runtime polymorphism)

            // Polymorphism: Downcasting
            Dog dog1 = (Dog) animal1; // Downcasting: Animal is a Dog
            dog1.eat(); // Output: Dog is eating
            dog1.sleep(); // Output: Dog is sleeping
            dog1.makeSound(); // Output: Dog is barking
            Cat cat1 = (Cat) animal2; // Downcasting: Animal is a Cat
            cat1.eat(); // Output: Cat is eating
            cat1.sleep(); // Output: Cat is sleeping
            cat1.makeSound(); // Output: Cat is meowing

            if (animal1 instanceof Dog) {
                Dog dog2 = (Dog) animal1; // Downcasting: Animal is a Dog
                dog2.eat(); // Output: Dog is eating
                dog2.sleep(); // Output: Dog is sleeping
                dog2.makeSound(); // Output: Dog is barking
            }

            if (animal2 instanceof Cat) {
                Cat cat2 = (Cat) animal2; // Downcasting: Animal is a Cat
                cat2.eat(); // Output: Cat is eating
                cat2.sleep(); // Output: Cat is sleeping
                cat2.makeSound(); // Output: Cat is meowing
            }

        }



}
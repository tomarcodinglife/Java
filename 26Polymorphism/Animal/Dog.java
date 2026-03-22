package Animal;

public class Dog extends Animal {
    @Override
    void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    void sleep(){
        System.out.println("Dog is sleeping");
    }

    @Override
    void makeSound(){
        System.out.println("Dog is barking");
    }
    

}

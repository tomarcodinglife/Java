package Animal;

public class Cat extends Animal {
    
    @Override
    void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    void sleep(){
        System.out.println("Cat is sleeping");
    }

    @Override
    void makeSound(){
        System.out.println("Cat is meowing");
    }

}

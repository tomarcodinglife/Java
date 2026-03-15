package Animal;

public class Dog extends Animal {
    private String breed;
    private String color;



    public Dog(String name, int age, String breed, String color) {
        super(name, age, 4);
        this.breed = breed;
        this.color = color;
    }

    
}

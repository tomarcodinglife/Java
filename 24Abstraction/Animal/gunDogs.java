package Animal;

public class gunDogs extends Dog {


    public gunDogs(String name, int age, String breed, String color) {
        super(name, age, breed, color);
    }


    public static void main(String[] args) {
        gunDogs officeDog = new gunDogs ("Buddy", 3, "German Shepherd", "Brown");
        Dog homeDog = new Dog("Sheru", 5, "Labrador Retriever", "Yellow");
        Animal dogAnimal = new Animal("Generic Animal", 3, 4);

        officeDog.makeSound("hun nun nun");
        homeDog.makeSound("woof woof");
        dogAnimal.makeSound("generic animal sound");

    }
    

}

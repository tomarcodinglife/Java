package ConstructorOverloading;

public class ConstructorOverloading {
    
    ConstructorOverloading() {
        System.out.println("This is a default constructor.");
    }

    ConstructorOverloading(int a) {
        System.out.println("This is a constructor with one parameter: " + a);
    }

    ConstructorOverloading(int a, int b) {
        System.out.println("This is a constructor with two parameters: " + a + " and " + b);
    }

    ConstructorOverloading(int a, int b, int c) {
        System.out.println("This is a constructor with three parameters: " + a + ", " + b + " and " + c);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
        ConstructorOverloading obj3 = new ConstructorOverloading(10, 20);
        ConstructorOverloading obj4 = new ConstructorOverloading(10, 20, 30);

        System.out.println("Creating objects with different constructors demonstrates constructor overloading.");
        

    }


}

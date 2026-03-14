package fourthChalanges;

public class StaticOuter {
    Static int x = 10;

    static class Inner{
        void display(){
            System.out.println("Value of x: " + x);
        }
    }
}

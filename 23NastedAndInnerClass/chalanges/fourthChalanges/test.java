package fourthChalanges;

public class test {
    

    public static void main(String[] args) {
        // using static inner class
        StaticOuter.Inner staticInner = new StaticOuter.Inner();
        staticInner.display();

        // using non-static inner class
        NonStaticOuter nonStaticOuter = new NonStaticOuter();
        NonStaticOuter.Inner nonStaticInner = nonStaticOuter.new Inner();
        nonStaticInner.display();
    }


}

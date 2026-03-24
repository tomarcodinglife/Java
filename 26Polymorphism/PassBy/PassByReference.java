package PassBy;

public class PassByReference {

    // In Java, when you pass an object to a method, you are passing a reference to that object. This means that if you modify the object inside the method, the changes will be reflected outside the method as well.

    public static class point {
        int x;
        int y;

        // Constructor to initialize the point
        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // toString method to display the point's coordinates
        @Override
        public String toString() {
            return "Point(" + x + ", " + y + ")";
        }
    
        
    }

     // Method to move the point by a certain distance
        public void move(point p){
            p.x ++;
            p.y ++;
        };

    public static void main(String[] args) {
        point p = new point(2, 3);

        System.out.println("Before moving: " + p); // Output: Before moving: Point(2, 3)

        PassByReference passByReference = new PassByReference();
        passByReference.move(p);
        System.out.println("After moving: " + p); // Output: After moving: Point(3, 4)


    }


    
}

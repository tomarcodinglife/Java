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
        System.out.println(p); // Output: Point(3, 4)
    };

    public static void main(String[] args) {

        // Create a point object
        point p = new point(2, 3);

        System.out.println("Before moving: " + p); // Output: Before moving: Point(2, 3)
        System.out.printf("x = %d, y = %d, x + y = %d\n", p.x, p.y, p.x + p.y);

        
        PassByReference passByReference = new PassByReference();
        passByReference.move(p); // Output: Point(3, 4)
        
    }


    
}

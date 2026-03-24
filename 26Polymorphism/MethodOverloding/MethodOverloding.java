package MethodOverloding;

public class MethodOverloding {
    
    public void sum (int a, int b) {
        System.out.println("The sum of two numbers is: " + (a + b));
    }

    public void sum (int a, int b, int c) {
        System.out.println("The sum of three numbers is: " + (a + b + c));
    }

    public void sum (int a, int b, int c, int d) {
        System.out.println("The sum of four numbers is: " + (a + b + c + d));
    }

    public void sum (int a, int b, int c, int d, int e) {
        System.out.println("The sum of five numbers is: " + (a + b + c + d + e));
    }

    public void sum (double a, double b) {
        System.out.println("The sum of two double numbers is: " + (a + b));
    }

    public void sum (double a, double b, double c) {
        System.out.println("The sum of three double numbers is: " + (a + b + c));
    }


    public static void main(String[] args) {
        MethodOverloding obj = new MethodOverloding();
        obj.sum(10, 20);
        obj.sum(10, 20, 30);
        obj.sum(10, 20, 30, 40);
        obj.sum(10, 20, 30, 40, 50);
    }


}

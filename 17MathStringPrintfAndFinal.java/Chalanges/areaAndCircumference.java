import java.util.Scanner;

public class areaAndCircumference {
    double radius;


    public areaAndCircumference(double radius){
        this.radius = radius;
    }

    public static double circleArea(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static double circleCircumference(double radius){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    @Override
    public String toString() {
        StringBuffer circleDetails = new StringBuffer("Circle Details ");
        circleDetails.append("\n");

        circleDetails.append("Radius : ").append(radius).append("\n");
        circleDetails.append("Area is : ").append(circleArea(radius)).append("\n");
        circleDetails.append("Circumference is : ").append(circleCircumference(radius)).append("\n");
        return circleDetails.toString();
    }
    

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Welcome to Circle World");
        System.out.println("Enter the circle radious : ");

        double radius  = input.nextDouble();

        areaAndCircumference myCircle = new areaAndCircumference(radius);
        System.out.println(myCircle);

    }


}

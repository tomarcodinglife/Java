package com.example.geometry;

public class Circle {
    public double radius;
    public double area;
    
    public Circle(double radius){
        this.radius = radius;
    }


    public double area(double radius){
        double result = (Math.PI * (Math.pow(radius, 2)));
        this.area = result;
        return result;
    }

    @Override
    public String toString(){
        return String.format("This is Circle which has %.2f and total area is %.2f", radius, area(radius));
    }
            
}

package com.example.geometry;

public class Rectangle {
    public double length;
    public double breadth;
    public double area;


    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }


    public double area(double length, double breadth){
        double result = length * breadth;
        this.area = result;
        return result;
    }


    @Override
    public String toString(){
        return String.format(
            "This is Rectangle which has %.2f length and %.2f breadth and area is %.2f", 
            length, breadth, area(length, breadth)
        );
    }

}

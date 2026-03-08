package com.example.utils;
import com.example.geometry.Circle;
import com.example.geometry.Rectangle;


public class Calculator{

    public static void main(String[] args) {
        
        Circle myCircle = new Circle(5.5);
        System.out.println(myCircle);

        Rectangle myRectangle = new Rectangle(5.8, 3.8);
        System.out.println(myRectangle);

        System.out.println(Math.ceil(myCircle.area));
        System.out.println(Math.ceil(myRectangle.area));

    }

}



package org.fmz.rtti;

import java.util.*;

class Shape{
    void draw(){
        System.out.println(this + ".draw()");
    }
    public String toString(){
        return getClass().getSimpleName();// awesome syntax
    }
}

class Circle extends Shape{}

class Square extends Shape{}

class Triangle extends Shape{}

public class Shapes{
    public static void main(String args[]){
        List<Shape> shape_list = Arrays.asList(new Circle(), new Square(), new Triangle());
        for(Shape s : shape_list)
            s.draw();
    }
}

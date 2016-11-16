package org.fmz.pattern;

public class DecoratorPatternDemo{
    public static void main(String args[]){
        Shape circle = new Circle();
        Shape triangle = new Rectangle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redTriangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        triangle.draw();
        redCircle.draw();
        redTriangle.draw();
    }
}

package org.fmz.pattern;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape){
        super(shape);
    }

    @Override
    public void draw(){
        decorateShape.draw();
        setRedBorder(decorateShape);
    }

    private void setRedBorder(Shape shape){
        System.out.println("Border color: Red");
    }
}

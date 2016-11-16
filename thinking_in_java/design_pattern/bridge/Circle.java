package org.fmz.pattern;

public class Circle extends Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI dAPI){
        super(dAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(){
        drawAPI.drawCircle(radius, x, y);
    }
}

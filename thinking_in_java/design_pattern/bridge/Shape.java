package org.fmz.pattern;

public abstract class Shape{
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI dAPI){
        drawAPI = dAPI;
    }

    public abstract void draw();
}

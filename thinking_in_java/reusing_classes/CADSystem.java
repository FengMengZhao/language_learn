package org.fmz.reuse;

class Shape{
    Shape(int i){
        System.out.println("Construct shape");
    }

    void dispose(){
        System.out.println("Dispose Shape");
    }
}

class Circle extends Shape{
    Circle(int i){
        super(i);
        System.out.println("Construct circle");
        
    }

    void dispose(){
        System.out.println("Dispose Circle");
        super.dispose();
    }
}

class Triangle extends Shape{
    Triangle(int i){
        super(i);
        System.out.println("Construct triangle");
    }

    void dispose(){
        System.out.println("Dispose triangle");
        super.dispose();
    }
}

class Line extends Shape{

    private int start;
    private int end;
    Line(int start, int end){
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Construct Line start " + start + " end " + end);
        
    }

    void dispose(){
        System.out.println("Dispose Line");
        super.dispose();
    }
}

public class CADSystem extends Shape{
    private Circle c;
    private Triangle t;
    private Line[] line = new Line[3];

    public CADSystem(int i){
        super(i+1);
        for(int j=0; j<line.length; j++){
            line[j] = new Line(j, j*j);
        }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Complete the construction");
    }

    public void dispose(){
        System.out.println("Dispose CADSystem");
        t.dispose();
        c.dispose();
        for(int i=0; i<line.length; i++)
            line[i].dispose();
        super.dispose();
    }

    public static void main(String args[]){
        CADSystem cs = new CADSystem(27);
        try{}
        finally{
            cs.dispose();
        }
    }
}

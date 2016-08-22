package org.fmz.polymorphism;

class Glyph {
    void draw(){
        System.out.println("Glyph draw()");
    }
    Glyph(){
        System.out.println("Glyph before draw()");
        draw();
        System.out.println("Glyph after draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph() " + radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw()" + radius);
    }
}

public class UnExpPolyInCons{
    public static void main(String args[]){
        new RoundGlyph(1);
    }
}

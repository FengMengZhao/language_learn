package org.fmz.pattern;

public class TemplatePatternDemo{
    public static void main(String args[]){
        Game g = new Cricket();
        g.play();
        g = new Football();
        g.play();
    }
}

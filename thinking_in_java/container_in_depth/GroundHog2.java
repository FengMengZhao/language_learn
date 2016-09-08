package org.fmz.container;

public class GroundHog2 extends GroundHog{
    public GroundHog2(int n){ super(n); }


    public int hashCode(){
        return number;
    }

    public boolean equals(Object o){
        return o instanceof GroundHog &&
            number == ((GroundHog2)o).number;
    }
}

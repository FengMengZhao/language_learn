package org.fmz.polymorphism;

class Shared{
    private int ref_count = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared(){
        System.out.println("Creating " + this);
    }
    public void addRef(){
        ref_count ++;
    }
    protected void dispose(){
        if(--ref_count == 0)
            System.out.println("Disposing " + this);
    }
    public String toString(){
        return "Shared " + id;
    }
}

class Composing{
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared){
        this.shared = shared;
        this.shared.addRef();
        System.out.println("Creating " + this);
    }
    protected void dispose(){
        System.out.println("Disposing " + this);
        shared.dispose();
    }
    public String toString(){
        return "Composing " + id;
    }
}

public class ReferenceCounting{
    public static void main(String args[]){
        Shared shared = new Shared();
        Composing[] composing = {
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared)};
        for(Composing c : composing)
            c.dispose();
    }
}

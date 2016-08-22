package org.fmz.generics;

public class ClassCapture<T>{

    private static class Building{}

    private static class House extends Building{}

    Class<T> kind;

    public ClassCapture(Class<T> tp){
        kind = tp;
    }

    public boolean beInstance(Object arg){
        return kind.isInstance(arg);
    }

    public static void main(String args[]){
        ClassCapture<Building> cb = new ClassCapture<Building>(Building.class);
        ClassCapture<House> ch = new ClassCapture<House>(House.class);

        System.out.println(cb.beInstance(new Building()));
        System.out.println(cb.beInstance(new House()));
        System.out.println(ch.beInstance(new Building()));
        System.out.println(ch.beInstance(new House()));
    }
}

package org.fmz.pattern;

public class RealImage implements Image{
    private String name;

    public RealImage(String fileName){
        name = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display(){
        System.out.println("Displaying " + name);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}

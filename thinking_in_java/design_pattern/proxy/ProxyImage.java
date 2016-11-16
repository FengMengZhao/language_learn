package org.fmz.pattern;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String name;

    public ProxyImage(String fileName){
        name = fileName;
    }

    @Override
    public void display(){
        if(realImage == null)
            realImage = new RealImage(name);
        realImage.display();
    }
}

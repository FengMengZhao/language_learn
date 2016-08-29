package org.fmz.pattern;

public class Strawberry implements Fruit{

    @Override
    public void grow(){
        log("Strawberry is growing...");
    }

    @Override
    public void plant(){
        log("Strawberry has been planted!!!");
    }

    @Override
    public void harvest(){
        log("Strawberry has been harvested!!!");
    }

    public static void log(String msg){
        System.out.println(msg);
    }
}

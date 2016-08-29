package org.fmz.pattern;

public class Apple implements Fruit{

    private int tree_age;

    @Override
    public void grow(){
        log("Apple is growing...");
    }

    @Override
    public void plant(){
        log("Apple has been planted!!!");
    }

    @Override
    public void harvest(){
        log("Apple has been harvested!!!");
    }

    public int getTreeAge(){
        return tree_age;
    }

    public void setTreeAge(int tree_age){
        this.tree_age = tree_age;
    }

    public static void log(String msg){
        System.out.println(msg);
    }
}

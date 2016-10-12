package org.fmz.pattern;

public class MySingleton{
    private static MySingleton instance = new MySingleton();

    public static MySingleton getInstance(){
        return instance;
    }

    private MySingleton(){}// no client can do: new MySingleton()
}

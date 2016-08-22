package org.fmz.container;

import java.util.*;

public class ForNameCreatorMe{
    public List<Class<? extends Pet>> types(){
        return types;
    }

    public static String[] classes = {
        "org.fmz.container.Mutt",
        "org.fmz.container.Pug",
        "org.fmz.container.EgyptianMau",
        "org.fmz.container.Manx",
        "org.fmz.container.Cymric",
        "org.fmz.container.Rat",
        "org.fmz.container.Mouse",
        "org.fmz.container.Hamster",
    };

    public static List<Class<? extends Pet>> types =
        new ArrayList<Class<? extends Pet>>();

    public static void load(){
        try{
            for(String str : classes)
                types.add((Class<? extends Pet>)Class.forName(str));
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    static {load();}
}

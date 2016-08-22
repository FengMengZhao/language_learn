package org.fmz.container;

import java.util.*;

public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types = 
        new ArrayList<Class<? extends Pet>>();
    private static String[] typenames = {
        "org.fmz.container.Mutt",
        "org.fmz.container.Pug",
        "org.fmz.container.EgyptianMau",
        "org.fmz.container.Manx",
        "org.fmz.container.Cymric",
        "org.fmz.container.Rat",
        "org.fmz.container.Mouse",
        "org.fmz.container.Hamster"
    };

    private static void loader(){
        try{
            for(String name : typenames)
                types.add((Class<? extends Pet>)Class.forName(name));
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    static{loader();}

    public List<Class<? extends Pet>> types(){return types;}
}

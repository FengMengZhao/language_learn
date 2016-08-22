package org.fmz.container;

import java.util.*;

public class ForNameCreatorMe2 extends PetCreatorMe{

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

    public List<Class<? extends Pet>> types(){

        List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();

        try{
            for(String str : classes)
                types.add((Class<? extends Pet>)Class.forName(str));
        }catch(Exception e){
            throw new RuntimeException(e);
        }

        return types;
    }
}

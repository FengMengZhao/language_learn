package org.fmz.container;

import java.util.*;

public class LiteralPetCreator extends PetCreator{
    public static final List<Class<? extends Pet>> all_types =
        Collections.unmodifiableList(Arrays.asList(
                    Pet.class,Dog.class,Cat.class,Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Hamster.class));
    private static final List<Class<? extends Pet>> types =
        all_types.subList(all_types.indexOf(Mutt.class), all_types.size());
    public List<Class<? extends Pet>> types(){
        return types;
    }
    public static void main(String arg[]){
        System.out.println(types);
    }
}

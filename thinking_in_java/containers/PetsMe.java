package org.fmz.container;

import java.util.*;

public class PetsMe{
    public static final PetCreatorMe FORNAME_CREATOR =
        new ForNameCreatorMe2();
    public static final PetCreator LITERAL_CREATOR =
        new LiteralPetCreator();
    public static Pet randomPet(){
        return LITERAL_CREATOR.randomPet();
    }
    public static Pet[] createArray(int size){
        return LITERAL_CREATOR.createArray(size);
    }
    public static List<Pet> arrayList(int size){
        return LITERAL_CREATOR.arrayList(size);
    }
}

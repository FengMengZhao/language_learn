package org.fmz.container;

import java.util.*;

public class PetsProxy{
    private PetCreator creator;

    public PetCreator getCreator(){
        return creator;
    }

    public PetsProxy(PetCreator creator){
        this.creator = creator;
    }

    public Pet randomPet(){
        return creator.randomPet();
    }

    public Pet[] createArray(int size){
        return creator.createArray(size);
    }

    public List<Pet> arrayList(int size){
        return creator.arrayList(size);
    }
}

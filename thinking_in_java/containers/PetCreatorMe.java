package org.fmz.container;

import java.util.*;

public abstract class PetCreatorMe {
    private static Random rand = new Random(26);

    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet(){
        int n = rand.nextInt(types().size());
        try{
            return types().get(n).newInstance();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public Pet[] createArray(int size){
        Pet[] array = new Pet[size];
        for(int i=0; i<size; i++)
            array[i] = randomPet();
        return array;
    }

    public List<Pet> arrayList(int size){
        List<Pet> array_list = new ArrayList<Pet>();
        Collections.addAll(array_list, createArray(size));
        return array_list;
    }
}

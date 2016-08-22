package org.fmz.container;

import java.util.*;

public class PetCount3{
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer>{
        public PetCounter(){
            for(Class<? extends Pet> pet_class_object : LiteralPetCreator.all_types)
                put(pet_class_object, 0);
        }

        public void count(Pet pet){
            for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()){
                if(pair.getKey().isInstance(pet))
                    put(pair.getKey(), pair.getValue() + 1);
            }
        }

        public String toString(){
            StringBuilder result = new StringBuilder("{");
            for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()){
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }
    }

    public static void main(String arg[]){
        PetCounter petCount = new PetCounter();
        for(Pet pet : Pets.createArray(200)){
            System.out.print(pet.getClass().getSimpleName() + " ");
            petCount.count(pet);
        }
        System.out.println();
        System.out.println(petCount);
    }
}

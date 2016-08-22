package org.fmz.container;

import java.util.*;

public class PetCountMe{
    static class PetCounter extends HashMap<String, Integer>{
        public void count(String str){
            Integer freq = get(str);
            put(str, freq == null ? 1 : freq + 1);
        }
    }

    public static void countPets(PetCreatorMe creator, int size){
        PetCounter counter = new PetCounter();
        for(Pet pet : creator.createArray(size)){
            System.out.print(pet.getClass().getSimpleName() + " ");
            if(pet instanceof Pet)
                counter.count("Pet");
            if(pet instanceof Cat)
                counter.count("Cat");
            if(pet instanceof Dog)
                counter.count("Dog");
            if(pet instanceof Rodent)
                counter.count("Rodent");
            if(pet instanceof Mutt)
                counter.count("Mutt");
            if(pet instanceof Pug)
                counter.count("Pug");
            if(pet instanceof EgyptianMau)
                counter.count("EgyptianMau");
            if(pet instanceof Manx)
                counter.count("Manx");
            if(pet instanceof Cymric)
                counter.count("Cymric");
            if(pet instanceof Rat)
                counter.count("Rat");
            if(pet instanceof Mouse)
                counter.count("Mouse");
            if(pet instanceof Hamster)
                counter.count("Hamster");
        }
        System.out.println();
        System.out.println(counter);
    }

    public static void main(String args[]){
        countPets(new ForNameCreatorMe2(), 200);
    }
}

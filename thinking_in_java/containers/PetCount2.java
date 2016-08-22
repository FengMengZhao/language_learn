package org.fmz.container;

public class PetCount2{
    public static void main(String args[]){
        //PetCount.countPets(Pets.creator);
        PetCount.countPets(new PetsProxy(new ForNameCreator()).getCreator());
    }
}

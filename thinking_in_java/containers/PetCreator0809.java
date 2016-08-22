package org.fmz.container;

import java.util.*;

public class PetCreator0809{
    private static List<Class<? extends Pet>> types = Arrays.asList(
            Mutt.class, Cymric.class, Hamster.class, Mouse.class,
            Manx.class, Pug.class, Rat.class, EgyptianMau.class);
    private static Random rand = new Random(26);

    public Pet randomPet(){
        int n = rand.nextInt(types.size());
        try{
            return types.get(n).newInstance();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    public Pet[] createArray(int size){
        Pet[] array = new Pet[size];
        for(int i = 0; i < size; i++)
            array[i] = randomPet();
        return array;
    }

    public List<Pet> arrayList(int size){
        List<Pet> array_list = new ArrayList<Pet>();
        Collections.addAll(array_list, createArray(size));
        return array_list;
    }

    private static class PetCounter extends HashMap<String, Integer>{
        public void count(String type){
            Integer freq = get(type);
            put(type, freq == null ?
                    1 : freq + 1);
        }
    }

    public static void countPets(PetCreator0809 creator, int size){
        PetCounter counter = new PetCounter();// in a static method: but the InnerClass is also static
        for(Pet p : creator.arrayList(size)){
            System.out.print(p.getClass().getSimpleName() + " ");
            if(p instanceof Pet)
                counter.count("Pet");
            if(p instanceof Dog)
                counter.count("Dog");
            if(p instanceof Cat)
                counter.count("Cat");
            if(p instanceof Rodent)
                counter.count("Rodent");
            if(p instanceof Mutt)
                counter.count("Mutt");
            if(p instanceof Cymric)
                counter.count("Cymric");
            if(p instanceof Mouse)
                counter.count("Mouse");
            if(p instanceof Hamster)
                counter.count("Hamster");
            if(p instanceof Manx)
                counter.count("Manx");
            if(p instanceof Pug)
                counter.count("Pug");
            if(p instanceof Rat)
                counter.count("Rat");
            if(p instanceof EgyptianMau)
                counter.count("EgyptianMau");
        }
        System.out.println();
        System.out.println(counter);
    }

    public static void main(String arg[]){
        countPets(new PetCreator0809(), 20);
    }
}

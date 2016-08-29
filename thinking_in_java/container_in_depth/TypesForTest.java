package org.fmz.container;

import java.util.*;

public class TypesForTest{

    static class SetType{
        int i;
        public SetType(int n){ i = n; }
        public boolean equals(Object o){
            return o instanceof SetType && 
                (i == ((SetType)o).i);
        }
        public String toString(){
            return Integer.toString(i);
        }
    }

    static class HashType extends SetType{
        public HashType(int n){ super(n); }
        public int hashCode(){ return i; }
    }

    static class TreeType extends SetType implements Comparable<TreeType>{
        public TreeType(int n){ super(n); }
        public int compareTo(TreeType arg){
            int res =  Integer.valueOf(i).compareTo(Integer.valueOf(arg.i));
            return -res;
        }
    }

    static <T> Set<T> fill(Set<T> set, Class<T> type){
        try{
            for(int i = 0; i < 10; i++)
                set.add(type.getConstructor(int.class).newInstance(i));
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        return set;
    }

    static <T> void test(Set<T> set, Class<T> type){
        fill(set, type);
        fill(set, type);
        fill(set, type);
        System.out.println(set);
    }

    public static void main(String args[]){
        test(new HashSet<HashType>(), HashType.class);
        test(new LinkedHashSet<HashType>(), HashType.class);
        test(new TreeSet<TreeType>(), TreeType.class);

        // Not override the hashCode() method, so the result is unexceptional
        test(new HashSet<SetType>(), SetType.class);
        // As above, Not override the hashCode() method, so the result is unexceptional
        test(new HashSet<TreeType>(), TreeType.class);
        // As above, unexceptional
        test(new LinkedHashSet<SetType>(), SetType.class);
        // As above, unexceptional
        test(new LinkedHashSet<TreeType>(), TreeType.class);

        // Not implemets Comparable, so cast exception occured
        try{
            test(new TreeSet<SetType>(), SetType.class);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        // As above, not implemets Comparable, so cast exception occured
        try{
            test(new TreeSet<HashType>(), HashType.class);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

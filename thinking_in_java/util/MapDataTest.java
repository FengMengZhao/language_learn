package org.fmz.util;

import java.util.Iterator;

public class MapDataTest{

    static class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer>{
        private int size = 9;
        private int number = 1;
        private char letter = 'A';

        public Pair<Integer, String> next(){
            return new Pair<Integer, String>(number++, "" + letter++);
        }

        public Iterator<Integer> iterator(){
            return new Iterator<Integer>(){
                public Integer next(){ return number++; }
                public boolean hasNext(){ return number < size; }
                public void remove(){ throw new UnsupportedOperationException(); }
            };
        }
    }

    public static void main(String args[]){
        //System.out.println(MapData.map(new Letters(), 70));
        System.out.println(MapData.map(new CountingGenerator.Character(), new RandomGenerator.String(10), 60));
    }
}

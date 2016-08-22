package org.fmz.autumn;

import java.util.*;

public class TestMinHeap{
    static Random rand = new Random(26);
    public static void main(String args[]){
        Heap min_heap = new MinHeap();
        for(int i = 0; i < 200; i++)
            min_heap.insert(rand.nextInt(10));
        for(int i = 0; i < 200; i++)
            System.out.print(min_heap.remove() + "\t");
    }
}

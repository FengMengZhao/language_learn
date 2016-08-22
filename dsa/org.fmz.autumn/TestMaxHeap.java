package org.fmz.autumn;

import java.util.*;

public class TestMaxHeap{
    static Random rand = new Random(26);
    public static void main(String args[]){
        Heap max_heap = new MaxHeap();
        for(int i = 0; i < 200; i++)
            max_heap.insert(rand.nextInt(10));
        for(int i = 0; i < 200; i++)
            System.out.print(((MaxHeap)max_heap).removeMax() + "\t");
    }
}

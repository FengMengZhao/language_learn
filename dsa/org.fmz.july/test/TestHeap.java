package org.fmz.july;

import java.util.*;

public class TestHeap{

    public static void main(String args[]){

        Random random = new Random();

        AbstractHeap heap = new MaxHeap();

        for(int i = 0; i < 20; i++){
            heap.insert(random.nextInt(100));
        }

        int count = heap.size();
        for(int i = 0; i < count; i++){
            System.out.print(heap.remove() + "\t");
        }
    }
}

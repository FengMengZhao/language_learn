package org.fmz.autumn;

import java.util.Random;

public class HeapTest{
    private static Random rnd = new Random(26);
    public static void main(String args[]){
        Heap<String> minHeap = new MinHeap<>();
        minHeap.insert("fmz");
        minHeap.insert("FMZ");
        minHeap.insert("cll");
        minHeap.insert("CLL");
        minHeap.insert("WLM");
        minHeap.insert("ZJB");
        minHeap.insert("wlm");
        minHeap.insert("zjb");
        for(String str : minHeap)
            System.out.print(str + ", ");
        System.out.println("\n########################");
        int i = minHeap.size();
        while(i-- > 0)
            System.out.print(((MinHeap)minHeap).removeMin() + ", ");
        System.out.println("\n########################");
        Heap<Integer> minHeap2 = new MinHeap<>();
        for(int j = 0; j < 100; j++)
            minHeap2.insert(new Integer(rnd.nextInt(50)));
        i = minHeap2.size();
        while(i-- > 0)
            System.out.print(((MinHeap)minHeap2).removeMin() + ", ");
        System.out.println("\n#######For MaxHeap##########");    

        Heap<String> maxHeap = new MaxHeap<>();
        maxHeap.insert("fmz");
        maxHeap.insert("FMZ");
        maxHeap.insert("cll");
        maxHeap.insert("CLL");
        maxHeap.insert("WLM");
        maxHeap.insert("ZJB");
        maxHeap.insert("wlm");
        maxHeap.insert("zjb");
        for(String str : maxHeap)
            System.out.print(str + ", ");
        System.out.println("\n########################");
        i = maxHeap.size();
        while(i-- > 0)
            System.out.print(((MaxHeap)maxHeap).removeMax() + ", ");
        System.out.println("\n########################");
        Heap<Integer> maxHeap2 = new MaxHeap<>();
        for(int j = 0; j < 100; j++)
            maxHeap2.insert(new Integer(rnd.nextInt(50)));
        i = maxHeap2.size();
        while(i-- > 0)
            System.out.print(((MaxHeap)maxHeap2).removeMax() + ", ");
        System.out.println("\n########################");
    }
}

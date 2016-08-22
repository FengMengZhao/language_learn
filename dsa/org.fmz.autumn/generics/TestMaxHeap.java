package org.fmz.autumn;

public class TestMaxHeap{
    public static void main(String args[]){
        MaxHeap<Integer> max = new MaxHeap<Integer>();
        max.insert(3);
        max.insert(9);
        max.insert(4);
        max.insert(7);
        max.insert(2);
        max.insert(8);
        max.insert(4);
        max.insert(3);
        max.insert(3);
        max.insert(3);
        max.insert(8);
        max.insert(7);
        max.insert(2);
        max.insert(8);
        max.insert(4);
        max.insert(17);
        max.insert(2);
        max.insert(8);
        max.insert(13);
        max.insert(4);

        //System.out.println(min.remove());
        //System.out.println(min.remove());

        for(Integer I : max)
            System.out.print(I + "\t");
        int size = max.size();
        System.out.println("size: " + size);
        for(int i = 0; i < size; i++)
            System.out.print(max.remove() + "\t");
    }
}

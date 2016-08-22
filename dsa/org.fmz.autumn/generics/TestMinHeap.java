package org.fmz.autumn;

public class TestMinHeap{
    public static void main(String args[]){
        MinHeap<Integer> min = new MinHeap<Integer>();
        min.insert(3);
        min.insert(9);
        min.insert(4);
        min.insert(19);
        min.insert(7);
        min.insert(2);
        min.insert(8);
        min.insert(13);
        min.insert(4);
        min.insert(3);
        min.insert(9);
        min.insert(4);
        min.insert(19);
        min.insert(7);
        min.insert(2);
        min.insert(3);
        min.insert(9);
        min.insert(4);
        min.insert(19);
        min.insert(7);
        min.insert(2);

        //System.out.println(min.remove());
        //System.out.println(min.remove());

        for(Integer I : min)
            System.out.print(I + "\t");
        System.out.println("size: " + min.size());
        int size = min.size();
        for(int i = 0; i < size; i++)
            System.out.print(min.remove() + "\t");
    }
}

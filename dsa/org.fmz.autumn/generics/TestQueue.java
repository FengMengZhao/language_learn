package org.fmz.autumn;

public class TestQueue{
    public static void main(String args[]){
        Queue<String> queue = new Queue<String>();

        queue.insertBack("fmz");
        queue.insertBack("cll");
        queue.insertBack("wlm");
        queue.insertBack("zjb");
        queue.insertBack("zj");
        queue.insertBack("fsl");
        queue.insertBack("fls");

        for(String str : queue)
            System.out.print(str + "\t");
        System.out.println();

        Queue<Integer> q = new Queue<Integer>();
        for(int i = 0 ; i < 100; i ++)
            q.insertBack(i);
        for(Integer I : q)
            System.out.print(I + "\t");
    }
}

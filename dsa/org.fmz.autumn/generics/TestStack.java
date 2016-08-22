package org.fmz.autumn;

public class TestStack{
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < 10; i++)
            stack.push(i);
        System.out.println("size: " + stack.size());

        for(Integer I : stack)
            System.out.print(I + "\t");
        System.out.println("size: " + stack.size());

        Stack<String> stack_str = new Stack<String>();

        stack_str.push("fmz");
        stack_str.push("cll");
        stack_str.push("wlm");
        stack_str.push("zjb");
        stack_str.push("fsl");

        for(String str : stack_str)
            System.out.print(str + "\t");
    }
}

package org.fmz.autumn;

public class StackTest {
    public static void main(String args[]){
        Stack<String> stack = new Stack<>();

        stack.push("fmz");
        stack.push("cll");
        stack.push("wlm");
        stack.push("zjb");
        stack.push("fsl");
        stack.push("fls");
        stack.push("rbr");

        for(String str : stack)
            System.out.print(str + ", ");
        System.out.println("\n##########################");

        while(stack.peek() != null) 
            System.out.print(stack.pop() + ", ");
    }
}

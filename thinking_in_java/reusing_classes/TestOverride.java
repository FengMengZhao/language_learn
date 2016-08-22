package org.fmz.reuse;

class Basic {
    public Integer sum(int a, int b){
        Integer temp = a + b;
        System.out.println("Basic: " + temp);
        return temp;
    }
}

class Sub extends Basic{
    public int sum(int a, int b, int c){
        int temp = a + b + c;
        System.out.println("Sub: " + temp);
        return temp;
    }
}

public class TestOverride{
    public static void main(String args[]){
        Basic b = new Sub();
        // can't compile
        //int temp = b.sum(2, 8, 10);
    }
}

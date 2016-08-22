package org.fmz.generics;

import java.util.*;

public class TestArrayList{
    public static void main(String args[]){
        List<String> list = Arrays.asList("1 2 3 4 5 6 7 8 9 10".split(" "));
        for(String s : list){
            System.out.println(s);
        }
    }
}

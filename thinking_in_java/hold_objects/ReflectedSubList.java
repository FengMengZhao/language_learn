package org.fmz.hold;

import java.util.*;

public class ReflectedSubList{
    public static void main(String args[]){

        List<String> list = new ArrayList<>(Arrays.asList("fmz cll zjb fsl fls".split(" ")));
        System.out.println(list);

        List<String> sub = list.subList(1, 3);
        sub.clear();
        System.out.println(list);
    }
}

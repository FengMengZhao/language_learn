package org.fmz.util;

import java.util.Arrays;

public class GeneratedTest{
    public static void main(String args[]){
        Integer[] arr = new Integer[]{4, 5, 6};
        System.out.println(Arrays.toString(arr));
        arr = Generated.array(arr, new CountingGenerator.Integer());
        System.out.println(Arrays.toString(arr));
        String[] str_arr = Generated.array(new String[15], new RandomGenerator.String());
        System.out.println(Arrays.toString(str_arr));
        String[] str_arr2 = Generated.array(String.class, new RandomGenerator.String(), 22);
        System.out.println(Arrays.toString(str_arr2));
    }
}

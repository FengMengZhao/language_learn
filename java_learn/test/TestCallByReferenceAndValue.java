/*
 * Java is pass by value, not by reference.
 * Changing the reference inside a method won't be reflected into the passed-in reference in the calling methon
 */

import java.util.* ;

public class TestCallByReferenceAndValue{
    static void swapInteger(Integer a, Integer b){
        Integer temp = a ;
        a = b ;
        b = temp ;
    }
    static void swapStringl(String sa, String sb){
        String temp = sa ;
        sa = sb ;
        sb = temp ;
    }
    static void changeInteger(Integer i){
        i = 100 ;
    }
    static void changeIntegerArray(Integer[] i_array){
        i_array[0] = 100 ;
    }
    static void changeIntArray(int[] i_array){
        i_array[0] = 100 ;
    }
public static void main(String args[]){
        Integer a = 10 ;
        Integer b = 20 ;
        swapInteger(a, b) ;
        System.out.println("a="+a+",b="+b) ;
        String sa = "fmz" ;
        String sb = "cll" ;
        System.out.println("sa="+sa+",sb="+sb) ;
        Integer i = 10 ;
        changeInteger(i) ;
        System.out.println("i="+i) ;
        Integer[] i_array = {1, 1, 1, 1} ;
        changeIntegerArray(i_array) ;
        System.out.println(Arrays.toString(i_array)) ;
        int[] int_array = {1, 1, 1, 1} ;
        changeIntArray(int_array) ;
        System.out.println(Arrays.toString(int_array)) ;
    }
}

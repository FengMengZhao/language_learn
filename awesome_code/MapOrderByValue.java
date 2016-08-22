package org.fmz.awesome;

import java.util.*;

public class MapOrderByValue{
    public static <K, V extends Comparable<? super V>> Map<K, V> orderByValue(Map<K, V> map){
        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>(){
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2){
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for(Map.Entry<K, V> entry : list)
            result.put(entry.getKey(), entry.getValue());
        return result;
    }

    public static void main(String args[]){
        Map<Integer, Character> arr = new HashMap<Integer, Character>();
        arr.put(1, 'c');
        arr.put(2, 'd');
        arr.put(3, 'r');
        arr.put(4, 'g');
        arr.put(5, 'h');
        arr.put(6, 'm');
        System.out.println(arr);
        System.out.println(orderByValue(arr));
    }
}

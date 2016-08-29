package org.fmz.container;

import java.util.*;
import org.fmz.util.Countries;

public class SimpleHashMap<K, V> extends AbstractMap<K, V>{

    static final int SIZE = 997;

    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];
    
    public V put(K key, V value){
        int index = Math.abs(key.hashCode()) % SIZE;
        V old_value = null;
        if(buckets[index] == null)
            buckets[index] = new LinkedList<MapEntry<K, V>>();
        LinkedList<MapEntry<K, V>> bucket = buckets[index];

        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K, V>> liter = bucket.listIterator();
        while(liter.hasNext()){
            MapEntry<K, V> entry = liter.next();
            if(entry.getKey().equals(key)){
                old_value = entry.getValue();
                liter.set(pair);
                found = true;
                break;
            }
        }
        if(!found)
            bucket.add(pair);
        return old_value;
    }

    public V get(Object key){
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null)
            return null;
        for(MapEntry<K, V> entry : buckets[index]){
            if(entry.getKey().equals(key))
                return entry.getValue();
        }
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet(){
        Set<Map.Entry<K, V>> entries = new LinkedHashSet<>();
        for(LinkedList<MapEntry<K, V>> bucket : buckets){
            if(bucket == null) continue;
            for(MapEntry<K, V> entry : bucket)
                entries.add(entry);
        }
        return entries;
    }

    public static void main(String args[]){
        SimpleHashMap<String, String> map = new SimpleHashMap<>();
        map.putAll(Countries.capitals(300));
        //System.out.println(map);
        System.out.println(map.get("CHINA"));
        //System.out.println(map.entrySet());
    }
}

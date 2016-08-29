package org.fmz.container;

import java.util.*;

public class MapEntry<K, V> implements Map.Entry<K, V>{
    private K key;
    private V value;
    public MapEntry(K k, V v){
        key = k;
        value = v;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value; 
    }
    public V setValue(V v){
        V res = value;
        value = v;
        return res;
    }
    public boolean equals(Object o){
        if(!(o instanceof MapEntry))
            return false;
        MapEntry me = (MapEntry)o;
        return key == null ? me.getKey() == null :
            key.equals(me.getKey()) && 
            value == null ? me.getValue() == null :
            value.equals(me.getValue());
    }

    public int hashCode(){
        return (key == null ? 0 : key.hashCode()) ^
            (value == null ? 0 : value.hashCode());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        sb.append("=");
        sb.append(value);
        return sb.toString();
    }
}

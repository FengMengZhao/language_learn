package org.fmz.util;

public class Pair<K, V>{
    /**
     * The key and value filds are made public and final
     * So that Pair becomes read-only Data Transfer Object
     */ 
    public final K key;
    public final V value;
    public Pair(K k, V v){
        key = k;
        value = v;
    }
}

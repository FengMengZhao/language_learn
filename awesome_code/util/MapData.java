<<<<<<< HEAD
package org.fmz.util;

import java.util.LinkedHashMap;

public class MapData<K, V> extends LinkedHashMap<K, V>{
    public MapData(Generator<Pair<K, V>> gen, int quantity){
        for(; quantity > 0; quantity--){
            Pair<K, V> p = gen.next();
            put(p.key, p.value);
        }
    }

    public MapData(Generator<K> genK, Generator<V> genV, int quantity){
        for(; quantity > 0; quantity--)
            put(genK.next(), genV.next());
    }

    public MapData(Generator<K> genK, V value, int quantity){
        for(; quantity > 0; quantity--)
            put(genK.next(), value);
    }

    public MapData(Iterable<K> genK, Generator<V> genV, int quantity){
        for(K key : genK)
            put(key, genV.next());
    }

    public MapData(Iterable<K> genK, V value, int quantity){
        for(K key : genK)
            put(key, value);
    }

    public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> gen, int quantity){
        return new MapData<K, V>(gen, quantity);
    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, Generator<V> genV, int quantity){
        return new MapData<K, V>(genK, genV, quantity);
    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, V value, int quantity){
        return new MapData<K, V>(genK, value, quantity);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> genK, Generator<V> genV, int quantity){
        return new MapData<K, V>(genK, genV, quantity);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> genK, V value, int quantity){
        return new MapData<K, V>(genK, value, quantity);
    }
}
=======
package org.fmz.util;

import java.util.LinkedHashMap;

public class MapData<K, V> extends LinkedHashMap<K, V>{
    public MapData(Generator<Pair<K, V>> gen, int quantity){
        for(; quantity > 0; quantity--){
            Pair<K, V> p = gen.next();
            put(p.key, p.value);
        }
    }

    public MapData(Generator<K> genK, Generator<V> genV, int quantity){
        for(; quantity > 0; quantity--)
            put(genK.next(), genV.next());
    }

    public MapData(Generator<K> genK, V value, int quantity){
        for(; quantity > 0; quantity--)
            put(genK.next(), value);
    }

    public MapData(Iterable<K> genK, Generator<V> genV, int quantity){
        for(K key : genK)
            put(key, genV.next());
    }

    public MapData(Iterable<K> genK, V value, int quantity){
        for(K key : genK)
            put(key, value);
    }

    public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> gen, int quantity){
        return new MapData<K, V>(gen, quantity);
    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, Generator<V> genV, int quantity){
        return new MapData<K, V>(genK, genV, quantity);
    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, V value, int quantity){
        return new MapData<K, V>(genK, value, quantity);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> genK, Generator<V> genV, int quantity){
        return new MapData<K, V>(genK, genV, quantity);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> genK, V value, int quantity){
        return new MapData<K, V>(genK, value, quantity);
    }
}
>>>>>>> f85629a531af9d5e4f973b09f304ebd569790ddc

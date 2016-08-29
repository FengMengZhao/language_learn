package org.fmz.container;

import java.util.*;
import org.fmz.util.Countries;

public class SlowMap<K, V> extends AbstractMap<K, V>{
    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();

    public V put(K key, V value){
        V res = get(key);
        if(res == null){
            keys.add(key);
            values.add(value);
        }else
            values.set(keys.indexOf(res), value);
        
        return res;
    }

    public V get(Object o){
        if(!keys.contains(o))
            return null;
        return values.get(keys.indexOf(o));
    }

    @Override
    public Set<Map.Entry<K,V>> entrySet(){
        Set<Map.Entry<K, V>> entries = new HashSet<>();
        Iterator<K> iter_k = keys.iterator();
        Iterator<V> iter_v = values.iterator();
        while(iter_k.hasNext())
            entries.add(new MapEntry<K, V>(iter_k.next(), iter_v.next()));
        return entries;
    }

    public static void main(String args[]){
        SlowMap<String, String> map = new SlowMap<>();
        map.putAll(Countries.capitals(300));
        //System.out.println(map);
        System.out.println(map.get("CHINA"));
        //System.out.println(map.entrySet());
    }
}

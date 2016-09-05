package org.fmz.util;

import java.util.ArrayList;

public class CollectionData<T> extends ArrayList<T>{
    public CollectionData(Generator<T> gen, int quantity){
        for(; quantity > 0; quantity--)
            add(gen.next());
    }

    public static <T> CollectionData list(Generator<T> gen, int quantity){
        return new CollectionData<T>(gen, quantity);
    }
}

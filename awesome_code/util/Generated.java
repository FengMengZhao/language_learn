<<<<<<< HEAD
package org.fmz.util;

public class Generated{
    public static <T> T[] array(T[] arr, Generator<T> gen){
        return new CollectionData<T>(gen, arr.length).toArray(arr);
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type, Generator<T> gen, int size){
        T[] arr = (T[])java.lang.reflect.Array.newInstance(type, size);
        return new CollectionData<T>(gen, arr.length).toArray(arr);
    }
}
=======
package org.fmz.util;

public class Generated{
    public static <T> T[] array(T[] arr, Generator<T> gen){
        return new CollectionData<T>(gen, arr.length).toArray(arr);
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type, Generator<T> gen, int size){
        T[] arr = (T[])java.lang.reflect.Array.newInstance(type, size);
        return new CollectionData<T>(gen, arr.length).toArray(arr);
    }
}
>>>>>>> f85629a531af9d5e4f973b09f304ebd569790ddc

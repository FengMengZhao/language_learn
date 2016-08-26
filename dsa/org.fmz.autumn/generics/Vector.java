package org.fmz.autumn;

public abstract class Vector<T> extends ArrayContainer<T>{

    public Vector(){}

    public Vector(int initCapacity){
        super(initCapacity);
    }


    /*
    public boolean contains(T element){
        return indexOf(element) != -1;
    }
    */
    public boolean contains(Object o){
        return indexOf(o) != -1;
    }


    @SuppressWarnings("unchecked")
    public T elementAt(int index){
        if(index < 0 || index >= num_items)
            return null;
        return (T)data[index];
    }


    /*
    public int indexOf(T element){
        int i = 0;
        while(i < num_items){
            if(element.equals(data[i]))
                return i;
            i++;
        }
        return -1;
    }
    */

    /*
     * The reason why parameter of indexOf() method is Object not the expect gerneric parameter as above:
     * You should be able pass in any type of object to indexOf() 
     * The object will be indexed doesn't to be the same type as the Object you pass in to indexOf()
     * We just return the lowest index i such that the code say (o == null ? data[i] ==  null : o.equals(data[i]))
     */
    public int indexOf(Object o){

        if(o == null){
            int i = 0;
            while(i < num_items){
                if(data[i] == null)
                    return i;
                i++;
            }
        }else{
            int i = 0;
            while(i < num_items){
                if(o.equals(data[i]))
                    return i;
                i++;
            }
        }
        return -1;
    }


    @SuppressWarnings("unchecked")
    public T removeAt(int index){
        if(index < 0 || index >= num_items)
            return null;
        T result = (T)data[index];
        for(int i = index; i < num_items-1; i++)
            data[i] = data[i+1];
        data[num_items-1] = null;
        num_items--;
        return result;
    }


    /*
    public boolean remove(T element){
        if(!contains(element))
            return false;
        removeAt(indexOf(element));
        num_items--;
        return true;
    }
    */ 
    public boolean remove(Object o){
        if(!contains(o))
            return false;
        else
            removeAt(indexOf(o));
         return true;
    }

    public boolean replace(int index, T element){
        if(index < 0 || index >= num_items)
            return false;
        data[index] = element;
        return true;
    }

    public abstract boolean append(T element);

    public abstract boolean insertAt(int index, T element);

}

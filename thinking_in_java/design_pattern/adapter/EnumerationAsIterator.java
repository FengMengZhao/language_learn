package org.fmz.pattern;

import java.util.Iterator;

public class EnumerationAsIterator implements Iterator{
    private final Enumeration enumeration;

    public EnumerationAsIterator(Enumeration e){
        enumeration = e;
    }

    public boolean hasNext(){
        return enumeration.hasMoreElements();
    }

    public Object next(){
        return enumeration.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}


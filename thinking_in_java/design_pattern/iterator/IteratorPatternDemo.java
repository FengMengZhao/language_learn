package org.fmz.pattern;

public class IteratorPatternDemo{
    public static void main(String args[]){
        NameRepository nr = new NameRepository();

        for(Iterator iter = nr.getIterator(); iter.hasNext();)
            System.out.print(iter.next() + ", ");
    }
}

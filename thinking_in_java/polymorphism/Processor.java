package org.fmz.polymorphism;

public interface Processor{
    default String name(){
        return getClass().getSimpleName();
    }
    Object process(Object s);
}

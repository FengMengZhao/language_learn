package org.fmz.concurrency;

public class Calculator{
    private ImmutableValue currentValue = null;

    public ImmutableValue getValue(){
        return currentValue;
    }

    public void setValue(ImmutableValue newValue){
        currentValue = newValue;
    }

    public void add(int newValue){
        currentValue = currentValue.add(newValue);
    }
}

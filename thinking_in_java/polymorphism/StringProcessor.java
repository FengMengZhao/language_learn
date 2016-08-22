package org.fmz.polymorphism;

import java.util.Arrays;

public abstract class StringProcessor implements Processor{
    /*
    public String name(){
        return getClass().getSimpleName();
    }
    */

    public static String s = "The autumn interview hope for a good job";

    public static void main(String args[]){
        ReuseApply.process(new UpperCaseString(), s);
        ReuseApply.process(new LowerCaseString(), s);
        ReuseApply.process(new SpliteString(), s);
    }
}

class UpperCaseString extends StringProcessor{
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class LowerCaseString extends StringProcessor{
    public String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class SpliteString extends StringProcessor{
    public String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}

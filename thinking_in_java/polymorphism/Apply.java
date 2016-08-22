package org.fmz.polymorphism;

import java.util.Arrays;

class Processor{
    String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}

class UpperCase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class LowerCase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Spliter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}

class Filter{
    String name(){
        return getClass().getSimpleName();
    }
    Waveform process(Waveform input){
        return input;
    }
}

class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }
    Waveform process(Waveform input){
        return input;
    }
}

class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    Waveform process(Waveform input){
        return input;
    }
}

class BandPass extends Filter{
    double lowcuff, highcuff;
    public BandPass(double lowcuff, double highcuff){
        this.lowcuff = lowcuff;
        this.highcuff = highcuff;
    }
    Waveform process(Waveform input){
        return input;
    }
}


public class Apply{
    public static void process(Processor p, String s){
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(s));
    }

    public static void processFilter(Filter f, Waveform w){
        System.out.println("Using filter " + f.name());
        System.out.println(f.process(w));
    }

    public static void main(String args[]){
       String s = "In the autumn interview hope for a good job";
        Apply.process(new UpperCase(), s);
        Apply.process(new LowerCase(), s);
        Apply.process(new Spliter(), s);
        

        //Waveform w = new Waveform();
        Apply.processFilter(new LowPass(1.0), new Waveform());
        Apply.processFilter(new HighPass(2.0), new Waveform());
        Apply.processFilter(new BandPass(1.0, 2.0), new Waveform());
    }
}


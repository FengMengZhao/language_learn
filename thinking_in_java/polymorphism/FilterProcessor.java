package org.fmz.polymorphism;

class FilterAdapter implements Processor{
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }

    public String name(){
        return filter.name();
    }

    public Waveform process(Object input){
        return filter.process((Waveform)input);
    }

}

public class FilterProcessor{
    public static void main(String arg[]){
        ReuseApply.process(new FilterAdapter(new LowPass(1.0)), new Waveform());
        ReuseApply.process(new FilterAdapter(new HighPass(2.0)), new Waveform());
        ReuseApply.process(new FilterAdapter(new BandPass(1.0, 2.0)), new Waveform());
    }
}

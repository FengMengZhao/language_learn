package org.fmz.polymorphism;

public abstract class WaveformProcessor implements Processor{
    /*
    public String name(){
        return getClass().getSimpleName();
    }
    */

    public static void main(String args[]){
        ReuseApply.process(new Lowprocess(1.0), new Waveform());
        ReuseApply.process(new Highprocess(2.0), new Waveform());
        ReuseApply.process(new Brandprocess(1.0, 2.0), new Waveform());
    }
}

class Lowprocess extends WaveformProcessor{
    private double cutoff;
    public Lowprocess(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Object input){
        return (Waveform)input;
    }
}

class Highprocess extends WaveformProcessor{
    private double cutoff;
    public Highprocess(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Object input){
        return (Waveform)input;
    }
}

class Brandprocess extends WaveformProcessor{
    private double highcut, lowcut;
    public Brandprocess(double lowcut, double highcut){
        this.highcut = highcut;
        this.lowcut = lowcut;
    }
    public Waveform process(Object input){
        return (Waveform)input;
    }
}

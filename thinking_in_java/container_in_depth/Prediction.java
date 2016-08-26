package org.fmz.container;

import java.util.*;

public class Prediction{
    private static Random rand = new Random(26);
    private boolean shadow = rand.nextDouble() > 0.5;
    public String toString(){
        if(shadow)
            return "Six more weeks of winter";
        else
            return "Early Spring";
    }
}


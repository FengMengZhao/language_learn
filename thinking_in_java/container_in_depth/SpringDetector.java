package org.fmz.container;

import java.lang.reflect.*;
import java.util.*;

public class SpringDetector{
    public static <T extends GroundHog> void detectSpring(Class<T> type) throws Exception{
        Constructor<T> ghog = type.getConstructor(int.class);

        Map<GroundHog, Prediction> map = new HashMap<>();
        for(int i = 0; i < 10; i++) 
            map.put(ghog.newInstance(i), new Prediction());
        System.out.println(map);
        GroundHog gh3 = ghog.newInstance(3);
        System.out.println("Looking for Groundhog 3");
        if(map.containsKey(gh3))
            System.out.println(map.get(gh3));
        else 
            System.out.println("Key not found: " + gh3);
    }

    public static void main(String args[]) throws Exception {
        detectSpring(GroundHog.class);
    }
}

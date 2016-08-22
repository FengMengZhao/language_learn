package org.fmz.arrays;

import java.util.*;

public class PersonFavorite{
    private static Random rand = new Random(26);
    private static final String[] PERSON_NAMES = {
        "冯孟昭", "陈亮亮", "王俐明", "张俊波",
        "冯山林", "冯留省", "任宝瑞", "张军"};

    public String[] selectFav(int num){
        String[] person_selected = new String[num];
        boolean[] flag = new boolean[PERSON_NAMES.length];
        for(int i = 0; i < num; i++){
            int t;
            do
                t = rand.nextInt(PERSON_NAMES.length);
            while(flag[t]);
            flag[t] = true;
            person_selected[i] = PERSON_NAMES[t];
        }
        return person_selected;
    }

    public static void main(String args[]){
        PersonFavorite pf = new PersonFavorite();
        for(int i=0; i<5; i++){
            System.out.println(Arrays.toString(pf.selectFav(3)));
        }
    }

}

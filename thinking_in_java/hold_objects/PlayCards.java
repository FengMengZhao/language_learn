package org.fmz.hold;

import java.util.*;

public class PlayCards{

    public static <T> List<T> dealHand(List<T> list, int per_hand_num){
        List<T> sub_list = list.subList(list.size() - per_hand_num, list.size());
        List<T> new_list = new ArrayList<>(sub_list);
        sub_list.clear();
        return new_list;
    }
    
    public static void main(String args[]){
        if(args.length < 2){
            System.out.println("Usage: java PlayCards num_hands per_hand_num");
            return;
        }
        
        String[] category = {"spades", "hearts", "diamonds", "clubs"};

        String[] item = {
            "ace", "2", "3", "4", "5", "6", "7", "8",
             "9", "10", "jack", "queen", "king"};

        List<String> cards = new ArrayList<>();
        for(int i = 0; i < category.length; i++)
            for(int j = 0; j < item.length; j++)
                cards.add(item[j] + " of " + category[i]);

        Collections.shuffle(cards);

        int num_hand = Integer.parseInt(args[0]);
        int per_hand_num = Integer.parseInt(args[1]);

        if(num_hand * per_hand_num > 52){
            System.out.println("There is not enough cards");
            return;
        }

        for(int i = 0; i < num_hand; i++){
            System.out.println(dealHand(cards, per_hand_num));
            System.out.println("****************************");
        }
    }
}

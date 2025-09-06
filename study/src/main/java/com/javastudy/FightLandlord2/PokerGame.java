package com.javastudy.FightLandlord2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;
import java.util.TreeSet;

public class PokerGame {
    static HashMap<Integer,String> card = new HashMap<>();

    /*
    Better use private here: If 2 table start the same time
        The second table will cover data of first tale cus error;
        
     */
    private List<Integer> cardIDList;

    static{
        String[] color = {"a","b","c","d"};
        String[] number = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        Integer cardWeight = 0;
        for (String n : number) {
            for (String c : color) {
                card.put(cardWeight, c + n);
                ++cardWeight;
            }
        }
        card.put(++cardWeight, "**joker**");
        card.put(++cardWeight, "***JOKER***");
    }


    public PokerGame(){
        //Better use treeset; it will make in in order!!
        //test 
        cardIDList = new ArrayList<>(card.keySet());
        Collections.shuffle(cardIDList);

        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();
        List<Integer> Lord = new ArrayList<>();

        TreeSet<Integer> player1Tree = new TreeSet<>();
        TreeSet<Integer> player2Tree = new TreeSet<>();
        TreeSet<Integer> player3Tree = new TreeSet<>();
        TreeSet<Integer> LordTree = new TreeSet<>();

        for (int i = 0; i < cardIDList.size(); i++) {
            if(i<=2){
                Lord.add(cardIDList.get(i));
                LordTree.add(cardIDList.get(i));
                continue;
            }
            switch (i%3) {
                case 0 -> player1.add(cardIDList.get(i));
                case 1 -> player2.add(cardIDList.get(i));
                case 2 -> player3.add(cardIDList.get(i));
            }
            switch (i%3) {
                case 0 -> player1Tree .add(cardIDList.get(i));
                case 1 -> player2Tree .add(cardIDList.get(i));
                case 2 -> player3Tree .add(cardIDList.get(i));
            }
        }

        System.out.println(player1Tree);
        System.out.println(player2Tree);
        System.out.println(player3Tree);
        System.out.println(LordTree);

        String result1 = showCard(player1, card);
        String result2 = showCard(player2, card);
        String result3 = showCard(player3, card);
        String result4 = showCard(Lord, card);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }


    public String showCard(List<Integer> playerIDList,HashMap<Integer,String> cardMap ){
        Collections.sort(playerIDList);
        StringJoiner sj = new StringJoiner(" ; ", "[", "]");
        for (int i = 0; i < playerIDList.size(); i++) {
            Integer cardID =  playerIDList.get(i);
            String cardString = cardMap.get(cardID);
            sj.add(cardString);
        }
        String result = sj.toString();
        return  result; 
    }
}

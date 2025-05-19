package com.javastudy.FightLandlord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerGame {
    // static : load when class start, only load once.

    static ArrayList<String> list = new ArrayList<>();// use list in static make sure they are all static
    static {
        // 1.prepare cards
        String[] color = { "spade ", "heart ", "diamond ", "club " };
        String[] number = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("joker");
        list.add("JOKER");

    }

    public PokerGame() {
        // 2.random cards orders
        Collections.shuffle(list);

        // 3.dealing cards
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> lord = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i < 3) {
                lord.add(list.get(i));
                continue;//skip the switch
            }

            switch (i % 3) {
                case 0 -> player1.add(list.get(i));// case 0 same as == 0
                case 1 -> player2.add(list.get(i));
                case 2 -> player3.add(list.get(i));
            }

        }

        pokerView("Lord", lord);
        pokerView("player1", player1);
        pokerView("player2", player2);
        pokerView("player3", player3);

    }

    public void pokerView(String name, List<String> list){
        System.out.println(name + " : ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}

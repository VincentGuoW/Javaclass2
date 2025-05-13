package com.javastudy.MAY_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Class07 {
    public static void main(String[] args) {
        // 70% boy & 30% girl chance ==>

        ArrayList<Integer> chanceList = new ArrayList<>();
        Collections.addAll(chanceList, 1,1,1,1,1,1,1);
        Collections.addAll(chanceList, 0,0,0);
        Collections.shuffle(chanceList);
        System.out.println(chanceList.get(0).toString());

        //or use random
        Random r = new Random();
        int index = r.nextInt(chanceList.size());
        System.out.println(chanceList.get(index));

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList, "A","B","C","D","E","F","G");
        Collections.addAll(girlList, "Aa","Ba","Ca","Da","Ea","Fa","Ga");
        Collections.shuffle(boyList);
        Collections.shuffle(girlList);

        if(chanceList.get(0)==1){
            System.out.println(boyList.get(0).toString());
        }else{
            System.out.println(girlList.get(0).toString());
        }
    }
}

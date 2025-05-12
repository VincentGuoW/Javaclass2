package com.javastudy.MAY_2025;

import java.util.ArrayList;
import java.util.Collections;

public class Class06 {
    public static void main(String[] args) {
        //There's number of N student in the class, random pick one
        //RQ: 70% BOY  ;  30% GIRL
        //Use Collections, not random()

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList, "A","B","C","D","E","F","G");
        Collections.addAll(girlList, "Aa","Ba","Ca","Da","Ea","Fa","Ga");
        Collections.shuffle(boyList);
        Collections.shuffle(girlList);
    }
}

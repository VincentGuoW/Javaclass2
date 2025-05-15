package com.javastudy.MAY_2025;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Class09 {
    public static void main(String[] args) {
        //txt file has 80 student & each student have their own roll
        //1. student who got pick will lower 50% chance that got pick next time
        //2. Third time must be Mr.Three
        ArrayList<String> studentNameList = new ArrayList<>();
        studentNameList = txtToString("study\\src\\main\\java\\com\\javastudy\\MAY_2025\\Class09TxT.txt");
        //System.out.println(studentNameList);
        
        HashMap<String,Integer> studentMap = new HashMap<>();
        for (int i = 0; i < studentNameList.size(); i++) {
            studentMap.put(studentNameList.get(i), 0);
        }
        //System.out.println(studentMap);



        for (int i = 0; i < 1000; i++) {
            Random r = new Random();
            int number= r.nextInt(studentMap.size());
            String studentName = studentNameList.get(number);
            Integer pickedTimes = studentMap.get(studentName)+1;
            studentMap.replace(studentName, pickedTimes);
        }
        System.out.println(studentMap);
        
        
    }

    public static ArrayList<String> txtToString(String filePath){
        ArrayList<String> result = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                result.add(line);
            }
        
        } catch (Exception e) {
            e.printStackTrace();
        }


        return  result;
    }

    
    public static String drawStudent(){
        String result = "";
        return  result;
    }
}

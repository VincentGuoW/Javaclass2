package com.javastudy.JULY_2025.FileSection.FileClass4;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class DemoFile {
    public static void main(String[] args) {
        File file = new File("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\FileSection\\FileClass4");
        countFile(file);
    }

    public static HashMap<String,Integer> countFile (File src){
        HashMap<String,Integer> hm = new HashMap<>();
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                System.out.println(file);
                //study\src\main\java\com\javastudy\JULY_2025\FileSection\FileClass4\DemoFile.java
                String[] str = file.getName().split("\\.");//split regex "."==> "\\."
                System.out.println(str[1]);//java

                if(hm.containsKey(str[1])){
                    int cout = hm.get(str[1]);
                    cout++;
                    hm.put(str[1], cout);
                }else{
                    hm.put(str[1], 1);
                }
            }else{
                HashMap<String,Integer> sonMaps = countFile(file);
                for (Map.Entry<String,Integer> sonMap  : sonMaps.entrySet()) {
                    String sonKey = sonMap.getKey();
                    Integer sonInteger = sonMap.getValue();
                    if(hm.containsKey(sonKey)){
                        hm.put(sonKey, hm.get(sonKey)+sonInteger);
                    }else{
                        hm.put(sonKey, sonInteger);
                    }
                }
            }
        }
        return hm;

    }
}

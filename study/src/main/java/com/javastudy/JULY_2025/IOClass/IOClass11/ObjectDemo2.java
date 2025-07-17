package com.javastudy.JULY_2025.IOClass.IOClass11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDemo2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass11\\Test.txt"));
        Object result = oos.readObject();
        System.out.println(result);
    
    
    }
}

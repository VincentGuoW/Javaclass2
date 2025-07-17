package com.javastudy.JULY_2025.IOClass.IOClass11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectDemo1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Student s1 = new Student(25, "Vincent");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass11\\Test.txt"));
    
        oos.writeObject(s1);

        oos.close();
    
    }
}

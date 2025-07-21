package com.javastudy.JULY_2025.IOClass.IOClass12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectMainTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "study\\src\\main\\java\\com\\javastudy\\JULY_2025\\IOClass\\IOClass12\\ObjectSave.txt"));
        Student s1 = new Student(21, "Tom", "MAD");
        Student s2 = new Student(22, "Lu", "Happy");
        Student s3 = new Student(20, "Henry", "Nothing");
        Student s4 = new Student(25, "Jack", "Crying");

        ArrayList<Student> studentArr = new ArrayList<>();
        studentArr.add(s1);
        studentArr.add(s2);
        studentArr.add(s3);
        studentArr.add(s4);

        oos.writeObject(studentArr);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "study\\\\src\\\\main\\\\java\\\\com\\\\javastudy\\\\JULY_2025\\\\IOClass\\\\IOClass12\\\\ObjectSave.txt"));
        ArrayList<Student> resultArr = (ArrayList<Student>) ois.readObject();
        for (Student student : resultArr) {
            System.out.println(student);
        }
    }
}

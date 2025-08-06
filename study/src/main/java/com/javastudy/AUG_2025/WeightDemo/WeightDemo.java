package com.javastudy.AUG_2025.WeightDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class WeightDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File inputFile = new File("study\\src\\main\\java\\com\\javastudy\\AUG_2025\\WeightDemo\\StudentInfo.txt");
        ArrayList<Student> inputStudents = StudentFileReader(inputFile);
        // System.out.println(inputStudents);
        Double[] basicWeight = basicWeight(inputStudents);

        Random r = new Random();
        int randomNumber = r.nextInt(basicWeight.length);
        Double newWeight = basicWeight[randomNumber] / 2;
        basicWeight[randomNumber] = newWeight;
        Double newTotalWeight = 0.0;
        for (Double eachWeight : basicWeight) {
            newTotalWeight = newTotalWeight + eachWeight;
        }
        Double[] newWeightArr = new Double[basicWeight.length];
        for (int i = 0; i < newWeightArr.length; i++) {
            newWeightArr[i] = basicWeight[i] / newTotalWeight;
            System.out.println(newWeightArr[i]);
        }

    }

    public static ArrayList<Student> StudentFileReader(File inpuFile) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(inpuFile));
        ArrayList<Student> inputStudents = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] result = line.split("-");
            Student newStudent = new Student(result[0], result[1], Integer.parseInt(result[2]),
                    Integer.parseInt(result[3]));
            inputStudents.add(newStudent);
        }
        br.close();
        return inputStudents;

    }

    public static Double[] basicWeight(ArrayList<Student> inputStudents) {
        int studentAmout = inputStudents.size();
        Double basicWeight = 1.0 / studentAmout; // 0.1
        Double[] weightArr = new Double[studentAmout];
        for (int i = 0; i < studentAmout; i++) {
            weightArr[i] = basicWeight;
        }
        return weightArr;
    }
}

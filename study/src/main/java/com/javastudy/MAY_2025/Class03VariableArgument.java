package com.javastudy.MAY_2025;

public class Class03VariableArgument {
    public static void main(String[] args) {
        String[] input = {"a","b","c","d","e"};
        method1(input);
        
    }

    public static void  method1 (String...input){
        StringBuilder sb = new StringBuilder();
        for (String input1 : input) {
            System.out.println(input1);
            sb.append(input1).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void  method2 (String intputSample,String...input){
        StringBuilder sb = new StringBuilder();
        for (String input1 : input) {
            System.out.println(input1);
            sb.append(input1).append(" ");
        }
        System.out.println(sb.toString());
    }
}

package com.javastudy.MAY_2025.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        /*
         * array1: six male actor name + age
         * "Edward,12" , "Tom,22" , "Henry,32" , "LeeXin,16" , "Vincent,17" , "Sam,18"
         * array2: six female actor name + age
         * "Amy,12" , "Iris,22" , "Rose,32" , "Alex,16" , "Alline,17" , "Chris,18"
         * 
         * 1.male actor only first two name length over 3
         * 2.femal actor only take name start with "A", but not the first one
         * 3.add male + female result together
         * 4. change all the info into Actor
         * 5. all actor into list
         * 
         * Actor class : name,age
         * 
         * 
         */
        System.out.println("-----------------");
        ArrayList<String> maleList = new ArrayList<>();
        Collections.addAll(maleList, "Edward,12", "Tom,22", "Henry,32", "LeeXin,16", "Vincent,17", "Sam,18");

        ArrayList<String> femaleList = new ArrayList<>();
        Collections.addAll(femaleList, "Amy,12", "Iris,22", "Rose,32", "Alex,16", "Alline,17", "Chris,18");

        Stream<String> maleStream = maleList.stream()
                .filter(s -> s.split(",")[0].length() > 3)
                .limit(2);
        // .forEach(s->System.out.println(s));

        System.out.println("-----------------");

        Stream<String> femaleStream = femaleList.stream()
                .filter(s -> s.split(",")[0].startsWith("A"))
                .skip(1);
        // .forEach(s->System.out.println(s));

        System.out.println("-----------------");

        // Stream.concat(maleStream, femaleStream).map(new Function<String, Actor>() {
        //
        // @Override
        // public Actor apply(String s) {
        // String name = s.split(",")[0];
        // Integer age = Integer.parseInt(s.split(",")[1]);
        // Actor a = new Actor(name, age);
        // return a;
        // }
        //
        // }).forEach(s -> System.out.println(s));
        //
        System.out.println("---------1111--------");

        List<Actor> result = Stream.concat(maleStream, femaleStream)
                .map(t -> new Actor(t.split(",")[0], Integer.parseInt(t.split(",")[1]))

                ).collect(Collectors.toList());

        System.out.println(result);
    }

    // actor class 11
    public static class Actor {
        String name;
        Integer age;

        public Actor() {
        }

        public Actor(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Actor{name='" + name + "', age=" + age + "}";
        }

    }

}

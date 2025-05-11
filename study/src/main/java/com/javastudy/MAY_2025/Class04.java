package com.javastudy.MAY_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Class04 {
    public static void main(String[] args) {
        /*
         * public static <T> void sort(List<T> list)
         * public static <T> void sort(List<T> list, Comparator<T> c)
         * public static <T> int binarySearch(List<T> list, T key)
         * public static <T> void copy(List<T> dest, List<T> src)
         * public static <T> int fill(List<T> list, T obj)
         * public static <T> void max/min(Collection<T> coll)
         * public static <T> void swap(List<?> list, int i, int j)
         */

        // public static <T> void sort(List<T> list)
        // 1. sort --> arrange in order (natural order)
        ArrayList<String> listSout = new ArrayList<>();
        Collections.addAll(listSout, "zzz", "xxx", "aaa", "bbb", "ccc", "ddd");
        Collections.sort(listSout);
        System.out.println(listSout);

        // public static <T> void sort(List<T> list, Comparator<T> c)
        // 2. sort --> arrange in order, but with special rules
        // e.g. descending order I picked
        ArrayList<String> listSout2 = new ArrayList<>();
        Collections.addAll(listSout2, "zzz", "xxx", "aaa", "bbb", "ccc", "ddd");
        // override the order part
        Collections.sort(listSout2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(listSout2);

        // public static <T> int binarySearch(List<T> list, T key)
        // 3. binarySearch for a list
        ArrayList<String> listSout3 = new ArrayList<>();
        Collections.addAll(listSout3, "zzz", "xxx", "aaa", "bbb", "ccc", "ddd");
        // binarySearch must be in natural order!!!!!
        Collections.sort(listSout3);
        Object binarySearchResult1 = Collections.binarySearch(listSout3, "aaa");
        Object binarySearchResult2 = Collections.binarySearch(listSout3, "ddd");
        Object binarySearchResult3 = Collections.binarySearch(listSout3, "zzz");
        System.out.println(binarySearchResult1);
        System.out.println(binarySearchResult2);
        System.out.println(binarySearchResult3);
        System.out.println(listSout3);

        // public static <T> void copy(List<T> dest, List<T> src)
        // dest means receive, src is the source!!!!
        // 4. copy a into b
        ArrayList<String> copyList1 = new ArrayList<>();
        ArrayList<String> copyList2 = new ArrayList<>();
        Collections.addAll(copyList1, "aaa", "bbb");
        Collections.addAll(copyList2, "ab", "bc", "cd", "de", "ef");
        // copy List1 into List 2
        // source list must be less than dest list!!!
        Collections.copy(copyList2, copyList1);
        System.out.println(copyList1);
        System.out.println(copyList2);

        // public static <T> int fill(List<T> list, T obj)
        // change all the element inside the list into sth esle
        ArrayList<String> fillList = new ArrayList<>();
        Collections.addAll(fillList, "aaa", "bbb", "ccc");
        Collections.fill(fillList, "DDD");
        // ["aaa","bbb","ccc"] ==> ["DDD","DDD","DDD"]
        System.out.println(fillList);

        ArrayList<String> maxminList = new ArrayList<>();
        Collections.addAll(maxminList, "aaa", "bbb", "ccc", "AAA", "EEE");
        Collections.max(maxminList);
        System.out.println(Collections.max(maxminList));
        System.out.println(Collections.min(maxminList));


        ArrayList<String> swapList = new ArrayList<>();
        Collections.addAll(swapList, "aaa", "bbb", "ccc", "AAA", "EEE");
        Collections.swap(swapList, 3, 0);
        System.out.println(swapList);

    }
}

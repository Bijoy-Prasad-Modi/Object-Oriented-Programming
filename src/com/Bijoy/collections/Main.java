package com.Bijoy.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(25);
        list2.add(62);
        list2.add(23);
        list2.add(45);

//        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(50);
        vector.add(24);
        vector.add(56);
        vector.add(35);
        vector.add(80);

        System.out.println(vector);
    }
}

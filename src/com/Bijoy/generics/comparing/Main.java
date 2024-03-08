package com.Bijoy.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Bijoy = new Student(85,78.35f);
        Student Manash = new Student(73,88.75f);
        Student Tushar = new Student(55,68.77f);
        Student Himesh = new Student(27,92.47f);
        Student Ayush = new Student(47,86.75f);

        Student list [] = {Bijoy, Manash, Tushar, Himesh, Ayush};
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//              //  return (int)(o1.marks - o2.marks);    //this will return all the marks data that is present in the array list in acending order
//                return -(int)(o1.marks - o2.marks);   //this will return all the marks data that is present in the array list in decending order
//            }
//        });

        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));


        System.out.println(Arrays.toString(list));

        if (Bijoy.compareTo(Manash)<0){
//            System.out.println(Bijoy.compareTo(Manash));
//            System.out.println("Manash has more marks");
        }
    }
}

package com.Bijoy.cloning;

import java.util.Arrays;

public class Main implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Bijoy = new Human(56,"Vijay");
//        Human twin = new Human(Bijoy);

        Human twin = (Human)Bijoy.clone();
        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(Bijoy.arr));  // twin shallow or deep coping the Main object Bijoy
        System.out.println(Arrays.toString(twin.arr));  // incase of shallow copy, change in copy object twin would be reflect on change in the main object, but incase of deep copy it will not
    }
}

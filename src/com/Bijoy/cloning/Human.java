package com.Bijoy.cloning;

public class Human implements Cloneable{
    int age ;
    String name ;
int[] arr;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,6,8,9,7};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name= other.name;
//    }
@Override
    public Object clone() throws CloneNotSupportedException{
        //this is shallow copy
//        return super.clone();


    //this is deep copy
    Human twin = (Human)super.clone();  //this is actually shallow copy

    //make a deep copy
    twin.arr = new int[twin.arr.length];
    twin.arr =new int [twin.arr.length];
    System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);  //this an enhanced for loo
    return twin;
    }
}

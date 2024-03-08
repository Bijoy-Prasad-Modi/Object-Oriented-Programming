package com.Bijoy.propeties.polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a + b ;
    }

    int sum(int a, int b, int c){
        return a + b ;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers ();
        obj.sum(5,6);
        obj.sum(6,9,8);
        // obj.sum(9,5,4,11); // will not work
    }
}

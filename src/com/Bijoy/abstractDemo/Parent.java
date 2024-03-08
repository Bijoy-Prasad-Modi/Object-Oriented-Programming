package com.Bijoy.abstractDemo;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }
    //abstract Parent(); // we also can not create Constructor out of Abstract classes


    static void hello(){   //But we can create static method, inside Abstract classes
        System.out.println("hey");
    }


    void normal (){  //Abstract Calsses can also contain Normal Method
        System.out.println("Abstract Classes can Contain Normal Method");
    }

    abstract void career ();
    abstract void partner ();
}

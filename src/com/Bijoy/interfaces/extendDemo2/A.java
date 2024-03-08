package com.Bijoy.interfaces.extendDemo2;

public interface A {

    //static interface methods should always have a body
    //we must implement this static methods by the interface name, like :[  A.greeting()  ]
    static void greeting(){
        System.out.println("I am in static method");
    }
    default void fun(){
        System.out.println("I am in A");
    }
}

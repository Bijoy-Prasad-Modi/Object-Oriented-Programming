package com.Bijoy.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
       // this.age=age;
       super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Captain America");
    }
}

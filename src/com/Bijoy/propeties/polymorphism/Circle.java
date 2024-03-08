package com.Bijoy.propeties.polymorphism;

public class Circle extends Shapes {
    //this will run when obj of circle ois created
    //hence it is overriding the parent method

    @Override //this is called annotation
    void area(){
        System.out.println("area is pi * r * r");
    }
}

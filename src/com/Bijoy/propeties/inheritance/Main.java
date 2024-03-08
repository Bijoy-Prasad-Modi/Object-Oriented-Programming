package com.Bijoy.propeties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(5); //it will call the constructor Box that takes no argument
        //if we pass nothing as argument it will call that Box constructor, which not taking any parameter as argument in it

        Box box2 = new Box(box1); // it will call that constructor Box, which takes another box as argument

//        System.out.println(box1.l+" "+ box1.w+" "+ box1.h);
//        System.out.println(box2.l+" "+box2.h+" "+box2.w);
//
//        Box box3 = new BoxWeight (5,4,9,5);
//        System.out.println(box3.w); //object box3 able to access the box3.w (width property, no problem) from BoxWeight class
        // System.out.println(box3.weight); // but not able to access the weight propert from the BoxWeight class

        //As, it is type of the reference variable, not the type of object that is determines, what members can be access
        BoxPrice box = new BoxPrice(5,8,200);


        Box.greeting();

        Box box5 = new BoxWeight ();
        box5.greeting(); // this will print the same result, as Box.greeting() As static methods can not be overridden from Parent (Box class) to child (BoxWeight class)
    }
}

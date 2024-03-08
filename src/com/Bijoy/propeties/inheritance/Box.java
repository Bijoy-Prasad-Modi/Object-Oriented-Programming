package com.Bijoy.propeties.inheritance;

public class Box {
    double h;
    double w;
    double l;
    double weight ;

    // @Override : you can not or we don't have to Override the static method as
    static void greeting(){
        System.out.println("hey i am in Box class, greeting!");
    }

    public Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    Box (double side){
        this.h= side ;
        this.l= side ;
        this.w= side ;
    }

    Box(Box old){
        this.h= old.h;
        this.l= old.l;
        this.w= old.w;
    }

    public Box(double h, double w, double l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }
    //    public void information(){
//        System.out.println("running the box");
//    }
}




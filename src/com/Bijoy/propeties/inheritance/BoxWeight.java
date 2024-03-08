package com.Bijoy.propeties.inheritance;

public class BoxWeight extends Box{
    double weight ;
    //@Override this static class here 👇 cannot be overridden as, static method can not be overridden from Parent to child class
    static void greeting(){
        System.out.println("hey i am in BoxWeight class, greeting!");
    }

    BoxWeight(){
        this.weight=-1;
    }


    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight=weight;
    }

    public BoxWeight(double h, double w, double l, double weight) {
        super(h, w, l); // call the parent lass constructor, used to initialized values present in Parent class
        this.weight = weight;
        System.out.println(super.weight); // here the weight variable reffering to the weight present in the Parent Box class

        //if we mentioned super(h,w,l); here which is right after 'this.weight' it will not work
        //As Parent class doesn't care about what child class contains, but child class do care about what Parent class contains so, we have to initialize the Parent class variables first


        // if we not call the super() keyword, the default constructor will be called
        //which is this {public Box()}, the constructor with no parameter
    }

}

package com.Bijoy.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        son.normal();

        Daughter daughter = new Daughter(28);
        daughter.career();

       // Parent mom = new Parent(); //it will show error
        //we can not create objects of an Abstract class, for that we have to use Override method like this 👇

//        Parent mom = new Parent(48) {
//            @Override
//            void career() {
//
//            }
//
//            @Override
//            void partner() {
//
//            }
//        };

        //Calling the static method
        Parent.hello();
    }
}

package com.Bijoy.enumExamples;

public class Basic {

    enum Week implements A{


        Monday, Tuesday, Wednessday, Thursday, Friday, Saturday, Sunday;

        //👆 these are enum constants
        //every single one here is public static and final
        //since it's final you can't create child enums
        // the enum type is week


        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }
        //this is not public or protected, only private and default
        // because if we create public or protected it will allow, initialization of more than one objects
        // As we only wanted to be constant number of objects for week, that's why it's not public
        //if we have fixed group of Objects that's when we use Enums

        //internally : public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week ;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));

//        for (Week day : Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week);
    }
}

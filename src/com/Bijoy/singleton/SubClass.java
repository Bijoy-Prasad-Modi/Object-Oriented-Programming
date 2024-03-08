package com.Bijoy.singleton;

import com.Bijoy.access.A;

public class SubClass extends A {  //only the SubClass can access the protected member in the base class. when it's different package
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10," Bijoy");
        int n = obj.num;
    }
}

class SubSubClass extends SubClass{

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(10," Bijoy");
        int n = obj.num;
    }
}

class SubClass2 extends A {  //only the SubClass can access the protected member in the base class. when it's different package
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(10," Bijoy");
        int n = obj.num;
    }
}
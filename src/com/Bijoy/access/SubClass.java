package com.Bijoy.access;

public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10," Bijoy");
        int n = obj.num;
    }
}


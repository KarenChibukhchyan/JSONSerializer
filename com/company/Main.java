package com.company;

import com.company.classesToBeSerialized.*;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        A ob1 = new A(20, 30f, "hello");

        A ob11 = new A(3, 4f, "222hello");


        B ob2 = new B(10, 10f, 40, 50.0, "bye");

        C ob3 = new C(3,5,5);

        SomeOtherClass ob4 = new SomeOtherClass();

        System.out.println(Serializer.serialize(ob1));

        System.out.println(Serializer.serialize(ob11));

        System.out.println(Serializer.serialize(ob2));

        System.out.println(Serializer.serialize(ob3));

        System.out.println(Serializer.serialize(ob4));

    }
}

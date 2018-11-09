package com.company.classesToBeSerialized;

import java.beans.Transient;
import java.time.LocalDate;

public class A {

    int a;
    float b;
    String c;

    @FieldTransient
    LocalDate date;

    public A(int a, float b, String c){
        this.a = a;
        this.b = b;
        this.c = c;

        date = LocalDate.now();
    }
}

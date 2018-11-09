package com.company.classesToBeSerialized;

import java.beans.Transient;
import java.time.LocalDate;

public class C {

    int a;
    int b;
    int c;

    @FieldTransient
    LocalDate date;

    @FieldTransient
    SomeOtherClass someOtherObject;

    public C(int a, int b, int c){

        this.a = a;
        this.b = b;
        this.c = c;

        date = LocalDate.now();

        someOtherObject = new SomeOtherClass();
    }
}


package com.company.classesToBeSerialized;


import java.time.LocalDate;

public class B {

        int a;
        float b;
        long l;
        double d;

        String c;

        @FieldTransient
        LocalDate date;

        @FieldTransient
        SomeOtherClass someOtherObject;

        public B(int a, float b, long l, double d, String c){
            this.a = a;
            this.b = b;
            this.l = l;
            this.d = d;

            this.c = c;

            date = LocalDate.now();

            someOtherObject = new SomeOtherClass();
        }
    }


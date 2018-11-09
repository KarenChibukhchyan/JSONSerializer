package com.company;

import com.company.classesToBeSerialized.ClassAnnotation;
import com.company.classesToBeSerialized.FieldTransient;

import java.beans.Transient;
import java.lang.reflect.Field;

public class Serializer {

    public  static String serialize(Object ob) throws IllegalAccessException {

        Class<?> sourceClass = ob.getClass();

        if (sourceClass.isAnnotationPresent(ClassAnnotation.class)) {
            return "Class "+sourceClass.getName()+" is skipped";
        }


        StringBuilder text = new StringBuilder("");

        text.append("{");
        text.append("\n\t\"Class Type\":" + "\""+sourceClass.getName()+"\",");
        text.append("\n\t\"Object name\":"+"\""+ob.toString()+"\",");

        Field[] fields = sourceClass.getDeclaredFields();

        text.append("\n\t\t\"Fields\":{");

        for (Field field : fields) {

            if (field.isAnnotationPresent(FieldTransient.class)) {
                continue;
            }

            field.setAccessible(true);
            text.append("\n\t\t\t\""+field.getName()+"\":"+"\""+field.get(ob)+"\",");
        }
        text.deleteCharAt(text.length()-1);
        text.append("\n\t\t}");
        text.append("\n}");

        return text.toString();
    }
}

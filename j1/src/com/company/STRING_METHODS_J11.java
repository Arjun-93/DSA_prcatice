package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class STRING_METHODS_J11 {
    public static void main(String[] args) {
        String name = "Arjun";
        //System.out.println(name);
        int value1 = name.length();
        //System.out.println(value1);
        String value2 = name.toLowerCase();
        //System.out.println(value2);
        String value3 = name.toUpperCase(Locale.ROOT);
        //System.out.println(value3);
        String  value4 = name.replace("A","");
        //System.out.println(value4);
        //String value5 = name.substring();



    }
}

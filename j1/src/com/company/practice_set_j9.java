package com.company;
import java.util.Scanner;

public class practice_set_j9 {
    public static void main(String[] args) {
        /*
        float b = 7/4*9/2;
        System.out.println(b);
        float a= 7/4.0f * 9/2.0f;
        System.out.println(a);
        */
        Scanner sc= new Scanner(System.in);
        float v =sc.nextFloat();
        float u = sc.nextFloat();
        float a = sc.nextFloat();
        float s = sc.nextFloat();
        float x = (float)(v*v-u*u)/(2*a*s);
        System.out.println(x);
    }
}

package com.company;

public class test {
    public static void main(String[] args) {
        String s1 = "DSA";
        int a = 5;
        int arr [] = new int[100];
        String s2 = "DSA";
        int b = 5;
        int arr2[] = arr;
        s2 = "JAVA";
        b = 100;
        arr2 [50] = 75;
        System.out.println(s1+" "+arr[51]+" "+arr[50]+" "+s2+" "+a+" "+b);


    }
}

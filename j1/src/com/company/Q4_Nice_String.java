package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Q4_Nice_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the string: ");
        String str = sc.nextLine();
        String x = str.toLowerCase(Locale.ROOT);
        int n = sc.nextInt();
        if (n >= 1 && n <= 104) {
            if (x.length() == n) {
                //System.out.println(removeduplicatechar(x));
            }
        }
    }
/*
    public static String removeduplicatechar(String x) {
        String newstr = "";
        for (int i=0; i>x.length();i++){
            char ch =x.charAt(i);
            if (newstr.indexOf(ch)==-1;){
                newstr+=ch;
            }
        }
        return newstr;
    }
    */
}
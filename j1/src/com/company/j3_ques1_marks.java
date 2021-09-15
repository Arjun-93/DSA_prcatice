package com.company;
import java.util.Scanner;

public class j3_ques1_marks {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Hello Friends, This system calculate your percentage");
        System.out.println("Please enter your marks");
        System.out.print("Enter your Maths marks: ");
        float m1 = sc1.nextFloat();
        System.out.print("Enter your Science marks: ");
        float m2 = sc1.nextFloat();
        System.out.print("Enter your English marks: ");
        float m3 = sc1.nextFloat();
        System.out.print("Enter your Hindi marks: ");
        float m4 = sc1.nextFloat();
        System.out.print("Enter your Social studies marks: ");
        float m5 = sc1.nextFloat();
        float f1 = (float) m1 +m2 +m3 +m4 +m5;
        float f2 = (float) (f1/500)*100;
        System.out.print("Your percentage is: ");
        System.out.print(f2);


    }
}

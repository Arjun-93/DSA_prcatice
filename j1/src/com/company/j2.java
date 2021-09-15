package com.company;
import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        System.out.println("Taking input from User");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a = sc.nextInt();
        System.out.println("Enter the number 2");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum of these numbers");
        System.out.println(c);
        String str = sc.nextLine();
        System.out.println(str);
        System.out.print("Enter the num1: ");
        float f1 = sc.nextFloat();
        System.out.print("Enter the num2: ");
        float f2 =sc.nextFloat();
        float f3 = f1*f2;
        System.out.println("Product of these numbers: ");
        System.out.print(f3);
    }
}

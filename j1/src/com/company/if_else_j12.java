package com.company;
import java.util.Scanner;

public class if_else_j12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Hello " +name+", You can drive and enjoy!");
        }
        else {
            System.out.println("you can not drive");
        }
    }
}

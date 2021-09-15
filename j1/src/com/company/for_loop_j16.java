package com.company;
import java.util.Scanner;

public class for_loop_j16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =sc.nextInt();
        System.out.println("The Multiplication Table of no. "+ n + " is as follows: ");
        for (int i=1; i<=10; i++){
            System.out.println(n+" x "+ i + " = " + n*i);

        }
    }
}

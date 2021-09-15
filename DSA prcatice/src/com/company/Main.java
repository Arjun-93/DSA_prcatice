package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        double mydoublr = 2.142;
//        int myint = (int)mydoublr;
//        System.out.println(mydoublr);
//        System.out.println(myint);
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter principal value: ");
        int x = sc.nextInt();
        System.out.println("Enter rate: ");
        float f = sc.nextFloat();
        System.out.println("Enter Time: ");
        int time =  sc.nextInt();
        float simpleinterest = x*f*time/100;
        System.out.println("The simple interest is: "+simpleinterest);
    }
}

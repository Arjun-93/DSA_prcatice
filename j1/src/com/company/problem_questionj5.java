package com.company;
import java.util.Scanner;

public class problem_questionj5 {
    public static void main(String[] args) {
        // question 1
        System.out.println("What is yours name");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        System.out.printf("Hello %s, Have a good bot, noob player, chal chup ho",str);
        System.out.println("Hello "+ str+ "have a nice day");


        // question 2
        System.out.println("Enter your number: ");
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc2.hasNextInt());

    }
}

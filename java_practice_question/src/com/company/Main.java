package com.company;

public class Main {

    public static void main(String[] args) {
	// Print prime number from 2 to 1000
        int i;
        for (i = 2;  i>=1000; i++)
            if (i%i==0) {
                System.out.println(i);
            }

    }
}

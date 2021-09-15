package com.company;

public class prime_numbers {
    public static void main(String[] args) {
        int n;
        for (n = 2; n <= 1000; n++) {
            if (n % 2 != 0 && n%n==0)  {
                System.out.println(n);
            }
        }

    }
}

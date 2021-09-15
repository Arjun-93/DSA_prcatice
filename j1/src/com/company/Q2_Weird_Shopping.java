package com.company;
import java.util.Scanner;

public class Q2_Weird_Shopping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100000];
        // System.out.println("Enter the number ");
        int n;
        n = sc.nextInt();
        //System.out.println("Enter values");
        for (int i = 0; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println("Enter the search value ");
        int x = sc.nextInt();
        int i;
        for ( i = 0; i <= n; i++) {
            if (arr[i] == x) {
                System.out.println(i+1);
                break;
            }
        }
        if (i==n){
            System.out.println("-1");
        }
    }
}

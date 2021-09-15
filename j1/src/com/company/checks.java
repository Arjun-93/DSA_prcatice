package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class checks {
        public static void main(String args[]) throws IOException {
            Scanner sc =new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = sc.nextInt();
            int a[] = new int[n];
            String line = br.readLine(); // to read multiple integers line
            String[] arr = line.trim().split("\\s+");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }
            System.out.println(arr);

        }
}

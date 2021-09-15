package com.company;
import java.util.Scanner;

public class Q5_Ayush_and_games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        int i;
        String NEwSTr = "";
        for (i = 0; i<=str.length(); i++) {
            for(int j =0; j<i; j++){
                if (i!=j);
                {
                    boolean b = str.charAt(i) == str.charAt(j);
                    NEwSTr += str.charAt(i);
                    boolean b1 = str.charAt(i) != str.charAt(j);
                    NEwSTr += str.charAt(i);
                }

            }
        }
        System.out.println(NEwSTr);
    }
}

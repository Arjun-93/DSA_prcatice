package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Q3_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String x = str.toLowerCase(Locale.ROOT);
         //System.out.println(x);
        String reverse = "";
        for (int i =x.length()-1; i>=0; i--){
            reverse = reverse + x.charAt(i);
            if (x.equals(reverse)){
                System.out.println("NO");
                break;
            }
            if (x.charAt(i)!=reverse.charAt(i)){
                System.out.println("YES");
                break;
            }
        }

        //System.out.println(reverse);
    }
}

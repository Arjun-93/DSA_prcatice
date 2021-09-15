package Midsem_lab;

import java.util.Scanner;

public class Question_1 {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // No. of zombies
    int K = sc.nextInt(); // No. of special attacks
    int count; // count normal attacksto kill zombie
    int[]zombie = new int[N];}
//
//    public  int largest(int sum) {
//        int i;
//        int max = zombie[0];
//        for (i = 1; i < zombie.length; i++)
//            if (zombie[i] > max)
//                max = zombie[i];
//        return  sum- max;
//    }
//    public int powerofzombie(){
//        int sum = 0;
//        for (int i = 0; i < zombie.length; i++) {
//            sum = sum + zombie[i];
//        }
//        return sum;
//    }
//    public int count(int sum ,int max ){
//        return  (sum-max);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt(); // No. of zombies
//        int K = sc.nextInt(); // No. of special attacks
//        int count; // count normal attacks to kill zombie
//        int[]zombie = new int[N];
//        for(int i=0; i <= N; i++){ zombie[i] = sc.nextInt();}
//        if (N<K){
//            System.out.println("0");
//        }else {
//          return largest();
//        }
//    }
//}

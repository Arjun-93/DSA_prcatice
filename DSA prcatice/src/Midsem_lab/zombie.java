package Midsem_lab;
import java.util.Scanner;
import java.util.Arrays;

public class zombie<i> {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] zombie = new int[N];

    public int loop() {
        for (int k = 0; k == K; k++) {
            remove();
        }
        System.out.println(zombie);
        int l = zombie.length;
        int zombiesum = 0;
        for (int e = 0; e < l; e++) {
            zombiesum = zombiesum + zombie[e];
        }
        return zombiesum;

    }

    public int remove() {
        int zombieMax = zombie[0];
        int maxIndex = 0;
        for (int i = 0; i <= N; i++) {
            if (zombie[i] > zombieMax) {
                zombieMax = zombie[i];
                maxIndex = i;
            }
        }
//         return  zombie.remove(maxIndex);
        return 0;
    }


    public void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // No. of zombies
        int K = sc.nextInt(); // No. of special attacks
        int count; // count normal attacks to kill zombie
        int[] zombie = new int[N];
        for (int i = 0; i <= N; i++) {
            zombie[i] = sc.nextInt();
        }
        if (N<K){
            System.out.println("0");
        }
        else {
            loop();

        }
    }
}


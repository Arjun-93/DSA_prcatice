package loops;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        // Sum of n natural numbers
      //  System.out.println(" Find sum of n natural numbers");
        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter the no: ");
//        int n = sc.nextInt();
//        long sum = 0;
//        for ( int i = 0; i<=n; i++){
//            sum = sum +i;
//        }
//        System.out.println(sum);

//        // infinite for loop
//        for (int x =0; x<10; x--){
//            System.out.println(x);
//        }

        // Factoial from loop;
        int y = sc.nextInt();
        long fact = 1;
        for (int z =1; z<=y; z++){
            fact = fact*z;
        }
        System.out.println(fact);
    }
}

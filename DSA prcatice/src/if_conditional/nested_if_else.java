package if_conditional;
import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) {
        System.out.println(" Program for maximum of three numbers ");
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter number1: ");
        int a = sc.nextInt();
        System.out.print("Enter number2: ");
        int b = sc.nextInt();
        System.out.print("Enter number3: ");
        int c = sc.nextInt();
        // Condition part
//        if (a>b){
//            if(a>c){
//                System.out.println("The maximum number is: "+ a);
//            } else {
//                System.out.println("The maximum number is: "+ c);
//            }
//        }
//        else {
//            if (b>c){
//                System.out.println("The maximum number is: "+ b);
//            } else{
//                System.out.println("The maximum number is: "+ c);
//            }
//
//        }
        // Shorthand method for doing above program
        int result =0;
        result  = a>b ? a>c ? a : c : b>c? b:c;
        System.out.println("The maximum number is: "+ result);
    }
}

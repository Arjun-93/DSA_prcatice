package COC;

public class barbarian {
    public static int  divisor(int n){
        int i ;
        int count = 0 ;
        for(i = 1; i <= n ; i++){
            for(int j = 1; j<= n ; j++){
                if(n%j==0){
                    count++;
                    if ( count == 9){
                        return n;
                    }
                }
            }
        }
        return  n ;
    }

    public static void main(String[] args) {
        divisor(1000);
        System.out.println(divisor(100));
    }
}

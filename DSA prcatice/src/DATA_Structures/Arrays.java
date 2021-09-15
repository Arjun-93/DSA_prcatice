package DATA_Structures;

public class Arrays {
    static int majortyelement(int[] a) {
        int asindex = 0;
        int count = 0;
        for (int i = 0; i<=a.length;i++){
            if (a[i] == a[asindex]){
                count++;
            } else{
                count--;
            }
            if(count == 0){
                asindex = i;
                count = 1;
            }
        }
        return asindex;
    }
    public static void main(String[] args) {
        int []x = {5, 4, 5, 6, 1, 2, 5, 1};
        majortyelement(x);
        // Find majority element by Moore's Voting method , Time complexity = O(n) and Space complexity = O(1)

    }
}
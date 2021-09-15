package Revise_DSA.Array;

public class Linear_search {
    public static int linear(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a1= {10,20,30,50,70,90};
        int n = a1.length;
        int key = 50;
        System.out.println(key+" is found at index: "+linear(a1, key));
    }

}

package com.company;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
class QuickSort {

    private int ary[];
    private int len;
    public void sort(int[] arr) {

        if (arr == null || arr.length == 0) {
            return;
        }
        this.ary = arr;
        len = arr.length;
        quickSort(0, len - 1);
    }
    private void quickSort(int low_index, int high_index) {
        int j = high_index;
        int i = low_index;
        int pivot = ary[low_index+(high_index-low_index)/2];
        while (i <= j) {
            while (ary[i] < pivot) {
                i++;
            }
            while (ary[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                j--;
                i++;
            }
        }
        if (low_index < j)
            quickSort(low_index, j);
        if (i < high_index)
            quickSort(i, high_index);
    }
    private void exchangeNumbers(int i, int j) {
        int temp = ary[i];
        ary[i] = ary[j];
        ary[j] = temp;
    }
    public static void main(String args[]) throws IOException {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        QuickSort ob = new QuickSort();
        ob.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

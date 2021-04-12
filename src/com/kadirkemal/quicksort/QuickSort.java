package com.kadirkemal.quicksort;

import java.util.Arrays;

public class QuickSort
{
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void quickSort(int arr[], int beginIndex, int endIndex){
        if(beginIndex >= endIndex){
            return;
        }

        int pivot = arr[endIndex];
        int j = beginIndex-1;

        for(int i=beginIndex; i<endIndex; i++){
            if(arr[i] < pivot){
                j++;
                swap(arr, i, j);
            }
        }

        j++;
        swap(arr, endIndex, j);

        quickSort(arr, beginIndex, j-1);
        quickSort(arr, j+1, endIndex);
    }

    public static void main(String args[])
    {
        int arr[] = {11,16,8,7,20,4,14};
        int n = arr.length;

        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, n-1);

        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
    }
}

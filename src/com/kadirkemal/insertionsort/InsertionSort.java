package com.kadirkemal.insertionsort;

import com.kadirkemal.selectionsort.SelectionSort;

import java.util.Arrays;

public class InsertionSort {

    void sort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int number = arr[i];

            int j = i-1;
            while(j >= 0 && arr[j] > number){
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = number;
        }
    }

    public static void main(String args[]) {
        InsertionSort insertionSort = new InsertionSort();
        int numbers[] = {11, 16, 8, 7, 20, 4, 14};

        System.out.println("*** Insertion Sort ***");
        insertionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}

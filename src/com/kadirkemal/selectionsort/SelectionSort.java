package com.kadirkemal.selectionsort;

import com.kadirkemal.bubblesort.BubbleSort;

import java.util.Arrays;

public class SelectionSort {

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minimumIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            swap(arr, minimumIndex, i);
        }
    }

    public static void main(String args[]) {
        SelectionSort selectionSort = new SelectionSort();
        int numbers[] = {11, 16, 8, 7, 20, 4, 14};

        System.out.println("*** Selection Sort ***");
        selectionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

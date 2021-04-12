package com.kadirkemal.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void bubbleSort(int arr[]) {
        int n = arr.length;

        int loopCounter = 0;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
                loopCounter ++;
            }
        }
        System.out.println("Loop counter: " + loopCounter);
    }

    void bubbleSort_v2(int arr[]) {
        int n = arr.length;

        int loopCounter = 0;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1-i; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
                loopCounter ++;
            }
        }
        System.out.println("Loop counter: " + loopCounter);
    }

    void optimizedBubbleSort(int arr[]) {
        int n = arr.length;

        int loopCounter = 0;
        boolean swapped = false;
        for (int i = 0; i < n-1; i++){
            swapped = false;
            for (int j = 0; j < n-1-i; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
                loopCounter ++;
            }
            if(! swapped){
                break;
            }
        }
        System.out.println("Loop counter: " + loopCounter);
    }

    public static void main(String args[]) {
        BubbleSort bubbleSort = new BubbleSort();
        int numbers[] = {11, 16, 8, 7, 20, 4, 14};

        System.out.println("*** Bubble Sort Without Any Optimization ***");
        int arr[] = Arrays.copyOf(numbers, numbers.length);
        bubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("*** Bubble Sort With Optimization ***");
        arr = Arrays.copyOf(numbers, numbers.length);
        bubbleSort.bubbleSort_v2(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("*** Bubble Sort With Optimization ***");
        arr = Arrays.copyOf(numbers, numbers.length);
        bubbleSort.optimizedBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

}

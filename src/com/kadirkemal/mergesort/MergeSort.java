package com.kadirkemal.mergesort;

import java.util.Arrays;

public class MergeSort {

    int[] mergeSortedArrays(int arr1[], int arr2[]){
        int n1=0;
        int n2=0;

        int k = 0;
        int[] result = new int[arr1.length+arr2.length];

        while(n1<arr1.length && n2<arr2.length){
            if(arr1[n1] < arr2[n2]){
                result[k] = arr1[n1];
                n1++;
            }
            else{
                result[k] = arr2[n2];
                n2++;
            }
            k++;
        }

        while(n1<arr1.length){
            result[k] = arr1[n1];
            n1++;
            k++;
        }

        while(n2<arr2.length){
            result[k] = arr2[n2];
            n2++;
            k++;
        }

        return result;
    }

    int[] mergeSort(int arr[])
    {
        if(arr.length <= 1){
            return arr;
        }

        int midPoint = arr.length / 2;

        int[] leftSorted = mergeSort(Arrays.copyOfRange(arr, 0, midPoint));
        int[] rightSorted = mergeSort(Arrays.copyOfRange(arr, midPoint, arr.length));

        return mergeSortedArrays(leftSorted, rightSorted);
    }

    public static void main(String args[])
    {
        int arr[] = {11,16,8,7,20,4,14};
        int n = arr.length;

        MergeSort ms = new MergeSort();
        int[] sortedArray = ms.mergeSort(arr);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(sortedArray));
    }
}

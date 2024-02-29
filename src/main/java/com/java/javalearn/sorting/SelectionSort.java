package com.java.javalearn.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));

        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Unsorted Array: " + Arrays.toString(array));

        selectionSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i <=  end ; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if  (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

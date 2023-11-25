package com.java.javalearn;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {22,27,15,40,9};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    static int [] bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}

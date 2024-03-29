package com.java.javalearn.binarysearch;

import java.util.Arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,22,21,15,12,9};
       Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,15));
       System.out.println(Arrays.toString(arr));
       System.out.println( orderAgnostic(arr,9));
    }

    static int orderAgnostic(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean asc = arr[start] < arr[end];

        while (start<=end){
            int mid = start + (end - start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(asc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }else{
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

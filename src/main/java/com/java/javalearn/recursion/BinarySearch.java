package com.java.javalearn.recursion;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,34,45,37,12};
        System.out.println(Arrays.toString(arr));
        System.out.println(binary(arr,4,0, arr.length-1 ));
    }

    static int binary(int[] arr,int target,int start,int end){

            int mid = start + (end - start)/2;

            //base condition
            if(start>end){
                return -1;
            }

            if(target==arr[mid]){
                return mid;
            }
            if (target>arr[mid]){
                return binary(arr,target,mid+1,end);
            }else {
               return binary(arr,target,start,mid-1);
            }
    };
}

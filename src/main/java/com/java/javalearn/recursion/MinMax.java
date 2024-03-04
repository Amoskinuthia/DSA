package com.java.javalearn.recursion;

public class MinMax {
    public static void main(String[]args){
        int [] arr = {2,3,4,5};
        minMax(arr, 0, 0, 0);
    }
    static void minMax(int[]arr,int min,int max,int index){
        if(index> arr.length-1){
            return;
        }
        if (arr[index] <= min) {
            min = arr[index];
        }
        minMax(arr, min, max, index+1);
        System.out.println(min);
    }
}

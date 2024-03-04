package com.java.javalearn;

public class SmallestPositiveIntNotInArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
       System.out.println( smnf(arr));
    }
    static int smnf(int[] arr){
        int min = 1;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                min++;
            }
        }

        return min;
    }
}

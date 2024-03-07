package com.java.javalearn.binarysearch;

//also known as pytonic array
public class PeakElementMountainArray {
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4,5,4,3,2,1,0};
        int peak = binary(nums);
        System.out.println(peak);
    }

    static int binary(int[] nums){
        int s = 0;
        int e = nums.length-1;
        while(s<e){
            int m = s  + (e-s)/2;
            if(nums[m]>nums[m+1]){
                e = m;
            }else {
                s = m + 1;
            }
        }
     return s;
    }
}

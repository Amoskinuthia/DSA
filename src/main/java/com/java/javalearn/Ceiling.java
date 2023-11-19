package com.java.javalearn;

public class Ceiling {

    public static void main(String[] args) {
        int [] nums = {2,3,5,8,19};
        int result = binarySearch(nums,6);
      System.out.println(nums[result]);
    }

    static int binarySearch(int [] nums,int target){
        int mid;
        int start = 0;
        int end = nums.length - 1;
        if(target>nums[nums.length-1]){
            return -1;
        }
        while (start<=end){
            mid = start + ((end - start) /2);
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
}

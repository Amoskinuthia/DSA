package com.java.javalearn;

class BinarySearch{
    public static void main(String[] args) {
        int [] nums = {2,3,5,8,19};
        int result = binarySearch(nums,6);
        if (result==1){
            System.out.print("Target found");
        }else{
            System.out.print("Target not found!");
        }
    }

    static int binarySearch(int [] nums,int target){
        int mid;
        int start = 0;
        int end = nums.length - 1;
        while (start<=end){
            mid = start + ((end - start) /2);
            if(nums[mid]==target){
                return 1;
            } else if (nums[mid]>target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
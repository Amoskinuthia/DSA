package com.java.javalearn;

public class RotatedArray {
    //find the pivot which is the largest number where elements start ascending i.e.  mid>mid+1
    //if mid < mid -1 then answer is mid-1
    //if start element is greater than the mid-element  then end is mid -1 ignoring the rest of the array
    //if start < mid then start = mid + 1
    //search for the target in the 1st half using binary search from 0 to the pivot
    //otherwise search in the second half using binary search from pivot + 1 till the end

    public static void main(String[] args) {
        int [] nums = {2,3,5,8,19};
        System.out.println(search(nums,8));

    }

    static int search(int[] nums,int target){
        int pivot = pivot(nums);
        if (pivot==-1){
            return binarySearch(nums,target,0, nums.length-1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarySearch(int [] nums,int target,int start,int end){
        int mid;
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
    static int pivot(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }
}

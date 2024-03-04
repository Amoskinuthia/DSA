package com.java.javalearn;

import java.util.Arrays;

class BinarySearch{
    public static void main(String[] args) {
        int [] nums = {2,3,5,8,8,19};
        int result = binarySearch(nums,5);
        int ansI = targetInfinite(nums,3);

        int[] lastFirst = binarySearchList(nums,8);
            System.out.println("Target found at index :"+result);
        System.out.println("Target found at index :"+ Arrays.toString(lastFirst ));
        System.out.println("Target found at index :"+ansI);

    }

    static int binarySearch(int [] nums,int target){
        int mid;
        int start = 0;
        int end = nums.length - 1;
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
        return -1;
    }
    static int[] binarySearchList(int[] nums, int target) {
        int[] results = {-1,-1};
        results[0] = answer(nums,target,true);
        results[1] = answer(nums,target,false);
        return results;
    }
   static int answer(int[] nums,int target,boolean start){
        int ans = -1;
        int s = 0;
        int e = nums.length-1;
        int m;
        while (s<=e){
            m = s + (e-s)/2;
            if(target>nums[m]){
                s = m+1;
            } else if (target<nums[m]) {
                e = m -1 ;
            }else {
                ans=m;
                if (start){
                    e = m-1;
                }else{
                    s = m +1;
                }

            }
        }
        return ans;
    }


    //get a target in an infinitely sorted array
    static int answe(int[] nums,int target,int s,int e){
        while (s<=e){
           int m = s + (e-s)/2;
            if (target>nums[m]){
                s = m+1;
            }else if(target<nums[m]){
                e = m-1;
            } else{
                return m;
            }
        }

        return -1;
    }

    static int  targetInfinite(int[] arr,int target){
        int s =0;
        int e = 1;
        while (target>arr[e]) {
            int newStart = e +1;
             e = e + (e -s +1)*2;
            s=newStart;
        }
        return answe(arr,target,s,e);
    }



}
package com.java.javalearn.binarysearch;

//also known as pytonic array
public class PeakElementMountainArray {
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4,5,4,3,2,1,0};
        int peak = peak(nums);
        int ans = search(nums,4);
        System.out.println(peak);
        System.out.println(ans);
    }

    static int search(int[] nums,int target){
        int peak = peak(nums);
        int first = orderAgnostic(nums,0,peak,target);
        if(first!=-1){
            return first;
        }
        return orderAgnostic(nums,peak+1,nums.length-1,target);
    }

    static int peak(int[] nums){
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
    public static int orderAgnostic(int[] arr,int s,int e, int target){
        boolean asc = arr[s]<arr[e];
        while (s<=e){
            int m = s + (e-s)/2;
            if(arr[m]==target){
                return arr[m];
            } else if (asc) {
                if(arr[m]>target){
                    e = m-1;
                }else{
                    s = m+1;
                }
            }else {
                if(arr[m]<target){
                    e = m-1;
                }else{
                    s = m+1;
                }
            }
        }
        return -1;
    }
}

package com.java.javalearn;

public class Ceiling {

    public static void main(String[] args) {
        int [] nums = {2,3,5,8,19};
        int result = binarySearch(nums,6);
        int floor = binaryFloor(nums,6);
      System.out.println(nums[result]);
      System.out.println(nums[floor]);
      char [] arr = {'a','b','c','f','k'};
          char ans = ceilString(arr,'d');
          System.out.println(ans);

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
     //ceiling of a string array
    static char ceilString(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return arr[start%arr.length];
    }

    //binary search floor
    static int binaryFloor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<end){
            mid = start + (end - start)/2;
            if(arr[mid] ==target){
                return mid;
            }else if (target>arr[mid]){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
        return end;
    }
}

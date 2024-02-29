package com.java.javalearn.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args){
        int [] A = {1, 2, 3, 4, 5};
        // Convert array to ArrayList using Arrays.asList()
//        ArrayList<Integer> arrayListA = new ArrayList<>(Arrays.asList(A));
//        ArrayList <ArrayList <Integer>>  lists = new ArrayList<>();
//        System.out.println(sumTriangle(arrayListA,lists));
//        printTriangle(A);
        trianglePrint(A);
        System.out.println(Arrays.toString(A));
    }

    static ArrayList<ArrayList<Integer>> sumTriangle(ArrayList <Integer>arr,ArrayList <ArrayList <Integer>>  lists ){
        lists.add(arr);
        ArrayList <Integer>  list = new  ArrayList <>();
        if (arr.size()==1){
            return lists;
        }
        for (int i = 0; i < arr.size()-1; i++) {
            int sum = arr.get(i) + arr.get(i + 1);
            list.add(sum);
        }
        sumTriangle(list,lists);
        return lists;
    }

    static void printTriangle(int[] arr){

        if(arr.length==1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] ans = new int[arr.length-1];
        for (int i = 0; i < arr.length-1 ; i++) {
            int sum = arr[i] + arr[i+1];
            ans[i] = sum;
        }
        printTriangle(ans);
        System.out.println(Arrays.toString(arr));
    }

    //without using for loop
    static void trianglePrint(int[] arr){
        if (arr.length == 1) {
            return;
        }

        int[] ans = new int[arr.length-1];
        helper(ans,arr,0);
        trianglePrint(ans);
        System.out.println(Arrays.toString(ans));
    }
    static int[] helper(int[] ans, int[] arr, int i) {
        if(i ==arr.length-1){
            return ans;
        }
        int sum = arr[i] + arr[i+1];
        ans[i] = sum;
        helper(ans,arr, i + 1);
        return ans;
    }

}


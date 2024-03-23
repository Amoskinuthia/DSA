package com.java.javalearn.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Dice {
    public static void main(String[] args){
        ArrayList<String> ans = passListDc("", new ArrayList<>(),3);
        System.out.println(ans);
    }
    public static ArrayList<String> dc(String p, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= target && i <= 6 ; i++) {
            list.addAll(dc(p+i,target-i));
        }
        return list;
    }

    public static ArrayList<String> passListDc(String p, ArrayList<String> list,int target){
        if(target==0){
            list.add(p);
            return list;
        }
        for (int i = 1; i <=target && i <= 6 ; i++) {
            passListDc(p+i,list,target-i);
        }
        return list;
    }
    public static ArrayList<String> passListDcFace(String p, ArrayList<String> list,int target,int face){
        if(target==0){
            list.add(p);
            return list;
        }
        for (int i = 1; i <=target && i <= face ; i++) {
            passListDcFace(p+i,list,target-i,face);
        }
        return list;
    }
}

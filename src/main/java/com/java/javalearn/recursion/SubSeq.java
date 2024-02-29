package com.java.javalearn.recursion;

public class SubSeq {
    public static void main(String[] args){
        String str = "abc";
        String answer = "";
        subSeq(str,answer);
    }
    public static void subSeq(String str, String answer){
        if(str.isEmpty()){
            System.out.println(answer);
            return;
        }
        char c = str.charAt(0);
        subSeq(str.substring(1),answer +c);
        subSeq(str.substring(1),answer);
    }
}

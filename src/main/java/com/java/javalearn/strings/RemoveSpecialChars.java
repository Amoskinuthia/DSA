package com.java.javalearn.strings;

public class RemoveSpecialChars {
    public static void main(String[] args) {
        String str = "java*11%$";
        String str2 = " jav a*1 1 %$";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println(str2.replaceAll("[ ]",""));
    }
}

package com.java.javalearn;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abccba";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){
       s = s.toLowerCase();
       int length = s.length();
        for (int i = 0; i <= length/2; i++) {
           char start = s.charAt(i);
           char end = s.charAt(length -1 -i);
           if (start!=end){
               return false;
           }

        }
        return true;
    }
    static boolean isPalindrom(String str){
        if (str==null||str.length()==0){
            return true;
        }
        str = str.toLowerCase();

            int start = 0;
            int end = str.length()-1;
            while (start<end) {

                if (str.charAt(start)!=str.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
        return true;
    }
}

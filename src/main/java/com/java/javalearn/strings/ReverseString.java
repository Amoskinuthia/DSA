package com.java.javalearn.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "HELLO";
        reverse(str);
    }

    static String reverse(String str){
        //METHOD 1
        char[] charArr = str.toCharArray();
        for (int i = charArr.length-1; i >=0 ; i--) {
            System.out.print(charArr[i]);
        }
        System.out.println(" ");
        //METHOD 2
        for (int i = charArr.length-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");
        //METHOD 3
        StringBuffer buffer = new StringBuffer(str);
        System.out.println(buffer.reverse());
        System.out.println(" ");
        //METHOD 4
        StringBuilder builder = new StringBuilder(str);
        System.out.println(builder.reverse());
        System.out.println(" ");

        return str;
    }

}

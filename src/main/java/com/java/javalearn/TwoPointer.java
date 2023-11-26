package com.java.javalearn;

public class TwoPointer {

        public static boolean isPalindrome(String s) {
            s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        public static void main(String[] args) {
            String s1 = "A man, a plan, a canal: Panama";
            String s2 = "race a car";

            System.out.println(isPalindrome(s1)); // Output: true
            System.out.println(isPalindrome(s2)); // Output: false
        }
    }


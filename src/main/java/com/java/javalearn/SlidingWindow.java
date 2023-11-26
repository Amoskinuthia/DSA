package com.java.javalearn;

import java.util.HashMap;
import java.util.Map;
public class SlidingWindow {
        public static int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> charIndexMap = new HashMap<>();
            int maxLength = 0;
            int start = 0;

            for (int end = 0; end < s.length(); end++) {
                char currentChar = s.charAt(end);
                if (charIndexMap.containsKey(currentChar)) {
                    start = Math.max(start, charIndexMap.get(currentChar) + 1);
                }
                charIndexMap.put(currentChar, end);
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }

        public static void main(String[] args) {
            String s = "abcabcbb";
            System.out.println(lengthOfLongestSubstring(s)); // Output: 3
        }

}

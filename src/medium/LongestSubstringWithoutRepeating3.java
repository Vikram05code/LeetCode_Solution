package medium;
/*
Problem: 3 - Longest Substring Without Repeating Characters
Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

Approach: Sliding Window (Last Seen Index, O(1) space)

Idea:
- Use a sliding window [start ... end]
- Track last seen index of each character using an array
- If a character repeats inside the current window:
    → Move start to lastSeen[ch] + 1
- Update max length at each step

Key Insight:
- Instead of removing characters one by one,
  we jump directly to the correct position

Time Complexity: O(n)
Space Complexity: O(1) (ASCII array of size 128)
*/

import java.util.Arrays;

public class LongestSubstringWithoutRepeating3 {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int[] array = new int[128];
        Arrays.fill(array, -1);

        for(int end=0; end<s.length(); end++){
            char ch = s.charAt(end);
            if(array[ch] >= start){
              start = array[ch]+1;
            }
            array[ch] = end;
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }

    public static void main(String[] args){
        LongestSubstringWithoutRepeating3 longestSubstringWithoutRepeating3 = new LongestSubstringWithoutRepeating3();
        String s = "abcabcbb";
        int result = longestSubstringWithoutRepeating3.lengthOfLongestSubstring(s);
        System.out.println("Longest Substring Length: " + result);
    }
}

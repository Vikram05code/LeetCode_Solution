package easy;
/*
Problem: 409 - Longest Palindrome
https://leetcode.com/problems/longest-palindrome/description/
Approach: Frequency Counting + Greedy

Idea:
- Palindrome needs character pairs
- Use all even counts
- For odd counts:
    use largest even portion
- One odd character can be placed in center

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LongestPalindrome409 {
    public int longestPalindrome(String s){
        int[] freq = new int[128];
        for(Character ch : s.toCharArray()){
            freq[ch]++;
        }
        int length = 0;
        for(int count : freq){
            length += (count/2)*2;
            if(length % 2 ==0 && count % 2 == 1){
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        LongestPalindrome409 obj = new LongestPalindrome409();
        String s = "abccccdd";
        int result = obj.longestPalindrome(s);
        System.out.println("Longest Palindrome Length: " + result);
    }
}

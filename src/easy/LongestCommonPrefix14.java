package easy;
/*
Problem: 14 - Longest Common Prefix
https://leetcode.com/problems/longest-common-prefix/description/
Approach: Horizontal Scanning

Idea:
- Start with first string as prefix
- Compare with remaining strings
- Reduce prefix until match found

Time Complexity: O(n * m)
Space Complexity: O(1)
*/

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs){
        if(strs==null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i<strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix14 obj = new LongestCommonPrefix14();
        String[] strs = {"flower", "flow", "flight"};
        String result = obj.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }

}

package easy;
/*
https://leetcode.com/problems/first-unique-character-in-a-string/description/
Problem: 387 - First Unique Character in a String

Approach: Frequency Counting

Idea:
- Count frequency of each character
- Traverse string again
- Return first character with frequency 1

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class FirstUniqueCharacter387 {
    public int firstUniqChar(String s){
        int[] freq = new int[26];
        for(Character ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter387 obj = new FirstUniqueCharacter387();
        String s = "loveleetcode";
        int result = obj.firstUniqChar(s);
        System.out.println("First Unique Character Index: " + result);
    }
}

package easy;
/*
Problem: 242 - Valid Anagram

Approach: Frequency Counting

Idea:
- Count characters from s
- Remove characters using t
- If all frequencies become zero,
  strings are anagrams

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int count : freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidAnagram242 obj = new ValidAnagram242();
        String s = "anagram";
        String t = "nagaram";
        boolean result = obj.isAnagram(s, t);
        System.out.println("Is Anagram: " + result);
    }
}

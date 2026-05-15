package medium;
/*
Problem: 151 - Reverse Words in a String
https://leetcode.com/problems/reverse-words-in-a-string/description
Approach: Split + Reverse Traversal

Idea:
- Remove extra spaces using trim()
- Split string using regex "\\s+"
- Traverse words in reverse order
- Join using single spaces

Time Complexity: O(n)
Space Complexity: O(n)
*/
public class ReverseWordsInString151 {
    public String reverseWords(String s){
        s = s.trim();
        if(s==null || s.length() == 0){
            return "";
        }
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = words.length-1; i>=0; i--){
            result.append(words[i]);
            if(i>0){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        ReverseWordsInString151 obj = new ReverseWordsInString151();
        String s = "  the sky is blue  ";
        String result = obj.reverseWords(s);
        System.out.println("Reversed Words: " + result);
    }
}

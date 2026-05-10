package easy;
/*
Problem: 392 - Is Subsequence

Approach: Two Pointers

Idea:
- Traverse both strings
- Match characters in order
- If characters match → move both pointers
- Else → move pointer of t

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class IsSubsequence392 {

    public static boolean isSubsequence(String s, String t){
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean result = isSubsequence(s, t);
        System.out.println("Is Subsequence: " + result);
    }
}

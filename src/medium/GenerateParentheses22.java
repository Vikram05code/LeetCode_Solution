package medium;
/*
Problem: 22 - Generate Parentheses
https://leetcode.com/problems/generate-parentheses/description/
Approach: Backtracking

Idea:
- Add '(' if open < n
- Add ')' if close < open
- Generate only valid combinations

Time Complexity: O(4^n / √n)
Space Complexity: O(n)
*/


import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    public List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);

       return result;
    }
    public void backtrack( List<String> result, String current, int open, int close, int n){
        if(current.length() == 2*n){
            result.add(current);
            return;
        }
        if(open < n){
            backtrack(result, current+"(", open+1, close, n);
        }
        if(open>close){
            backtrack(result, current+")", open, close+1, n);
        }
    }

    public static void main(String[] args){
        GenerateParentheses22 obj = new GenerateParentheses22();
        int n = 3;
        List<String> result = obj.generateParenthesis(n);
        System.out.println("Generated Parentheses: " + result);
    }
}

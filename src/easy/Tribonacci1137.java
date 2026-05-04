package easy;
/*
Problem: 1137 - N-th Tribonacci Number
Link: https://leetcode.com/problems/n-th-tribonacci-number/

Approach: Dynamic Programming (Space Optimized)

Idea:
- Each value depends on previous three values
- Use three variables instead of recursion or array

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class Tribonacci1137 {
    public int tribonacci(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int prev3 = 0;
        int prev2 = 1;
        int prev1 = 1;
        for(int i=3; i<=n; i++){
            int current = prev3+prev2+prev1;
            prev3=prev2;
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }

    public static void main(String[] args){
        Tribonacci1137 obj = new Tribonacci1137();
        int n = 10;
        int result = obj.tribonacci(n);
        System.out.println("Tribonacci(" + n + ") = " + result);
    }
}

package easy;
/*
Problem: 509 - Fibonacci Number
Link: https://leetcode.com/problems/fibonacci-number/

Approach:
1. Recursive - O(2^n)
2. Iterative DP (Optimized) - O(n), O(1) space

Idea:
- Each Fibonacci number depends on previous two values
- Use two variables to store previous results

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class FibonacciNumber509 {


    /*public int fib(int n) {
        if(n == 0 || n == 1) return n;
        return fib(n-1) + fib(n-2);
    }*/

    public int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int prev2=0;
        int prev1=1;
        for(int i=2; i<=n; i++){
            int current = prev1+prev2;
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }

    public static void main(String[] args){
        FibonacciNumber509 fibonacciNumber509 = new FibonacciNumber509();
        int n = 10;
        int result = fibonacciNumber509.fib(n);
        System.out.println("Fibonacci number at position " + n + ": " + result);
    }
}
